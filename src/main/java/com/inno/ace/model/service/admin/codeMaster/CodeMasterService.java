package com.inno.ace.model.service.admin.codeMaster;

import com.inno.ace.model.vo.admin.CodeMasterVO;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;

import java.util.List;

public interface CodeMasterService {

    /**
     * 코드 마스터 리스트 조회
     * @param pagingVO
     * @return
     */
    ResultVO selectCodeMasterList(PagingVO pagingVO);

    /**
     * @apiNote 코드 마스터 저장
     * @param codeMasterVO
     * @return
     */
    ResultVO insertCodeMaster(CodeMasterVO codeMasterVO);

    /**
     * @apiNote 코드 마스터 수정
     * @param codeMasterVO
     * @return
     */
    ResultVO updateCodeMaster(CodeMasterVO codeMasterVO);

    /**
     * @apiNote 코드 마스터 삭제
     * @param codeMasterId
     * @return
     */
    ResultVO deleteCodeMaster(int codeMasterId);

    ResultVO syncCodeMaster(List<CodeMasterVO> codeMasterList);

}
