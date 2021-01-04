package com.inno.ace.model.service.menu;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.MenuDao;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuDao menuDao;

    /**
     * 메뉴 리스트 조회
     * @return
     */
    public ResultVO selectMenuList() {
        List<MenuVO> menuList = menuDao.selectMenuList();
        Map<String, Object> map = new HashMap<>();
        map.put("routerMenuList",menuList.stream().filter(menu -> StringUtils.isNotEmpty(menu.getPageUrl())).collect(Collectors.toList()));
        for(MenuVO menuVO : menuList) {
            menuVO.setChildren(menuList.stream().filter(menu -> menu.getMenuId() != 0 && menu.getParMenuId()== menuVO.getMenuId()).collect(Collectors.toList()));
        }
        map.put("menuList", menuList.stream()
                .filter(menu -> 0 == menu.getMenuId())
                .findFirst()
                .orElseGet(MenuVO::new)
                .getChildren());
        return ResultVO.builder().data(map).build();
    }

    /**
     * 메뉴 권한 리스트
     * @return
     */
    public ResultVO selectAuthMenuList(int menuId) {
        return ResultVO.builder().data(menuDao.selectAuthMenuList(menuId)).build();
    }

    /**
     * 메뉴 단건 조회
     * @param menuId
     * @return
     */
    public ResultVO selectMenu(int menuId) {
        return ResultVO.builder().data(menuDao.selectMenu(menuId).orElseGet(MenuVO::new)).build();
    }

    /**
     * 메뉴 동기화
     * @param menuList
     * @return
     * @throws Exception
     */
    @Transactional
    public ResultVO syncMenu(List<MenuVO> menuList) throws Exception {
        long result = 0;
        String resultMsg = "메뉴 동기화에 성공하였습니다.";
        callMenu(menuList);
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 메뉴 재귀 호출 함수
     * @param menuList
     */
    public void callMenu(List<MenuVO> menuList) {

        for(MenuVO menuVO : menuList) {

            menuDao.insertMenu(menuVO);

            if(menuVO.getChildren().size() > 0) {
                callMenu(menuVO.getChildren());
            }
        }
    }

    /**
     * 순서 변경
     * @param gu
     * @param ord
     * @param parMenuId
     * @return
     */
    @Transactional
    public ResultVO updateOrd(int gu, int ord, int parMenuId) {
        List<MenuVO> menuList = menuDao.selectMenuListByParMenuId(parMenuId);
        MenuVO menuVO = menuList.get(ord-1);    // 해당 순번에 있는 메뉴 꺼내오기
        menuList.remove(ord-1);           // 꺼낸 메뉴 삭제
        int chgOrd = ord;
        switch (gu) {
            case 1:
                // 순번을 최상위로 변경
                chgOrd = 0;
                break;
            case 2:
                // 순번을 하나 위로 변경
                chgOrd = ord-2;
                break;
            case 3 :
                // 순번을 하나 아래로 변경
                chgOrd = ord;
                break;
            case 4:
                chgOrd = menuList.size();
                break;
        }
        menuList.add(chgOrd, menuVO);
        for(int i=0; i<menuList.size(); i++) {
            menuList.get(i).setOrd(i+1);
            menuDao.updateOrd(menuList.get(i).getOrd(), menuList.get(i).getMenuId());
        }
        return ResultVO.builder().data(chgOrd).build();
    }

    /**
     * 메뉴 삭제
     * @param menuId
     * @return
     */
    @Transactional
    public ResultVO deleteMenu(int menuId) {
        menuDao.deleteMenu(menuId);
        return ResultVO.builder().resultMsg(CommonMsg.SUCCESS_DELETE.getMsg()).build();
    }

}
