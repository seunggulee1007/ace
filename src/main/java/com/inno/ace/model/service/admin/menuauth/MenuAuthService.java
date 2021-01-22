package com.inno.ace.model.service.admin.menuauth;

import com.inno.ace.model.vo.admin.MenuAuthVO;
import com.inno.ace.model.vo.common.ResultVO;

public interface MenuAuthService {

    ResultVO insertMenuAuth(MenuAuthVO menuAuthVO);

    ResultVO updateMenuAuth(MenuAuthVO menuAuthVO);

}
