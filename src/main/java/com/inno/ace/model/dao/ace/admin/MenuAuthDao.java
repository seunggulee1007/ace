package com.inno.ace.model.dao.ace.admin;

import com.inno.ace.model.vo.admin.MenuAuthVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MenuAuthDao {

   List<MenuAuthVO> selectMenuAuthList();

   Optional<MenuAuthVO> selectMenuAuth(int menuAuthId);

   int insertMenuAuth(MenuAuthVO menuAuthVO);

   int updateMenuAuth(MenuAuthVO menuAuthVO);

   int deleteMenuAuth(int menuAuthId);


}
