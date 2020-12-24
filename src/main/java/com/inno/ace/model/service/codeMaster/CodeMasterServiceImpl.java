package com.inno.ace.model.service.codeMaster;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.CodeMasterDao;
import com.inno.ace.model.service.code.CodeService;
import com.inno.ace.model.vo.CodeMasterVO;
import com.inno.ace.model.vo.CodeVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeMasterServiceImpl implements CodeMasterService {

    // 코드 마스터 dao
    private final CodeMasterDao codeMasterDao;
    private final CodeService codeService;

    /**
     * 코드 마스터 리스트 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectCodeMasterList(PagingVO pagingVO) {
        pagingVO.calcPage(codeMasterDao.selectCodeMasterCnt());
        return ResultVO.builder().data(codeMasterDao.selectCodeMasterList(pagingVO)).build();
    }

    /**
     * @apiNote 코드 마스터 저장
     * @param codeMasterVO
     * @return
     */
    @Transactional
    public ResultVO insertCodeMaster(CodeMasterVO codeMasterVO) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_WRITE.getMsg();
        if(codeMasterDao.insertCodeMaster(codeMasterVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * @apiNote 코드 마스터 수정
     * @param codeMasterVO
     * @return
     */
    @Transactional
    public ResultVO updateCodeMaster(CodeMasterVO codeMasterVO) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_MODIFY.getMsg();
        if(codeMasterDao.updateCodeMaster(codeMasterVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * @apiNote 코드 마스터 삭제
     * @param codeMasterId
     * @return
     */
    @Transactional
    public ResultVO deleteCodeMaster(int codeMasterId) {
        int result = 0;
        String resultMsg= CommonMsg.SUCCESS_DELETE.getMsg();
        if(codeMasterDao.deleteCodeMaster(codeMasterId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    public ResultVO syncCodeMaster(List<CodeMasterVO> codeMasterList) {
        for(CodeMasterVO codeMasterVO : codeMasterList) {
            codeMasterDao.insertCodeMaster(codeMasterVO);
            for(CodeVO codeVO : codeMasterVO.getCodeList()) {
                codeService.insertCode(codeVO);
            }
        }
        return ResultVO.builder().resultMsg(CommonMsg.SUCCESS_SYNC.getMsg()).build();
    }

}
