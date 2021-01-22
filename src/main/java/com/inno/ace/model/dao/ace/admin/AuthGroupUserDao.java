package com.inno.ace.model.dao.ace.admin;

import com.inno.ace.model.vo.admin.AuthGroupUserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthGroupUserDao {


   int insertAuthGroupUser(AuthGroupUserVO authGroupUserVO);

   int deleteAuthGroupUser(int authGroupId);


}
