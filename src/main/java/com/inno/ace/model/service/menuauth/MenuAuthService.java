package com.inno.ace.model.service.menuauth;

import com.inno.ace.model.vo.MenuAuthVO;
import com.inno.ace.model.vo.ResultVO;

public interface MenuAuthService {

    ResultVO insertMenuAuth(MenuAuthVO menuAuthVO);

    ResultVO updateMenuAuth(MenuAuthVO menuAuthVO);

}
