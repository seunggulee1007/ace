package com.inno.ace.model.service.menu;

import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.ResultVO;

import java.util.List;

public interface MenuService {

    /**
     * 메뉴 리스트 조회
     * @return ResultVO
     */
    ResultVO selectMenuList();

    /**
     * 메뉴 조회
     * @param menuId
     * @return ResultVO
     */
    ResultVO selectMenu(int menuId);

    /**
     * 메뉴 권한 리스트 조회
     * @return ResultVO
     */
    ResultVO selectAuthMenuList(int menuId);

    /**
     * 메뉴 동기화
     * @param menuList
     * @return ResultVO
     * @throws Exception
     */
    ResultVO syncMenu(List<MenuVO> menuList) throws Exception;

    /**
     * 메뉴 순번 변경
     * @param gu
     * @param parMenuId
     * @param ord
     * @return ResultVO
     */
    ResultVO updateOrd(int gu, int ord, int parMenuId);

    /**
     * 메뉴 삭제
     * @param menuId
     * @return ResultVO
     */
    ResultVO deleteMenu(int menuId);

}
