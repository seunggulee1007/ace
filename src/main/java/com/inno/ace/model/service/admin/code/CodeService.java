package com.inno.ace.model.service.admin.code;

import com.inno.ace.model.vo.admin.CodeVO;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;

import java.util.List;

public interface CodeService {

    ResultVO selectCodeList(PagingVO pagingVO);

    List<CodeVO> selectCodeListByCodeMasterNm(String codeMasterNm);

    ResultVO insertCode(CodeVO codeVO);

    ResultVO updateCode(CodeVO codeVO);

    ResultVO deleteCode(int codeId);

    ResultVO updateOrd(int gu, int ord, int codeMasterId);

}
