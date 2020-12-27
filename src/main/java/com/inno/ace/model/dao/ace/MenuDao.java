package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.MenuAuthVO;
import com.inno.ace.model.vo.MenuVO;
import com.inno.ace.model.vo.RouterVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MenuDao {

    /** 메뉴 리스트 조회 */
    List<MenuVO> selectMenuList();

    /** 메뉴 조회 */
    Optional<MenuVO>selectMenu(int menuId);

    /** 메뉴 권한 리스트 */
    List<MenuAuthVO> selectAuthMenuList(int menuId);

    /** 부모가 같은 메뉴 전체 조회 */
    List<MenuVO> selectMenuListByParMenuId(int parMenuId);

    /** 메뉴 등록 */
    int insertMenu(MenuVO menuVO);

    /** 메뉴 순번 변경 */
    int updateOrd(int ord, int menuId);

    /** 메뉴 삭제 */
    int deleteMenu(int menuId);

}
