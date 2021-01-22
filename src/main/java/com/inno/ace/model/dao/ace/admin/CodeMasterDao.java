package com.inno.ace.model.dao.ace.admin;

import com.inno.ace.model.vo.admin.CodeMasterVO;
import com.inno.ace.model.vo.common.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeMasterDao {

    /**
     * @apiNote 코드 마스터 건수 조회
     * @return
     */
    int selectCodeMasterCnt();

    /**
     * @apiNote 코드 마스터 조회
     * @author leesg
     * @return
     */
    List<CodeMasterVO> selectCodeMasterList(PagingVO pagingVO);

    /**
     * @apiNote 코드 마스터 정보 등록
     * @author leesg
     * @param codeMasterVO
     * @return
     */
    int insertCodeMaster(CodeMasterVO codeMasterVO);
    
    /**
     * @apiNote 코드 마스터 정보 수정
     * @author leesg
     * @param codeMasterVO
     * @return
     */
    int updateCodeMaster(CodeMasterVO codeMasterVO);
    
    /**
     * @apiNote 코드 마스터 삭제
     * @author leesg
     * @param codeMasterId
     * @return
     */
    int deleteCodeMaster(int codeMasterId);
    
}
