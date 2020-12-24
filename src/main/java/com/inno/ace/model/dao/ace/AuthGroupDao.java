package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.AuthGroupVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AuthGroupDao {

   List<AuthGroupVO> selectAuthGroupList();

   Optional<AuthGroupVO> selectAuthGroup(int authGroupId);
   
   int insertAuthGroup(AuthGroupVO authGroupVO);

   int updateAuthGroup(AuthGroupVO authGroupVO);

   int deleteAuthGroup(int authGroupId);


}
