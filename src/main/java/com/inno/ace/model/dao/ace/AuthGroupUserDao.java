package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.AuthGroupUserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Mapper
public interface AuthGroupUserDao {


   int insertAuthGroupUser(AuthGroupUserVO authGroupUserVO);

   int deleteAuthGroupUser(int authGroupId);


}
