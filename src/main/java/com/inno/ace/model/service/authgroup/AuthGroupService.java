package com.inno.ace.model.service.authgroup;

import com.inno.ace.model.vo.AuthGroupVO;
import com.inno.ace.model.vo.ResultVO;

public interface AuthGroupService {

    /**
     * 권한 그룹 목록
     * @return
     */
    ResultVO selectAuthGroupList();

    /**
     * 권한 그룹 명 중복 체크
     * @param authGroupNm
     * @return
     */
    ResultVO selectDupleGroupNm(String authGroupNm);

    /**
     * 권한 그룹 등록
     * @param authGroupVO
     * @return
     */
    ResultVO insertAuthGroup(AuthGroupVO authGroupVO);

    /**
     * 권한 그룹 수정
     * @param authGroupVO
     * @return
     */
    ResultVO updateAuthGroup(AuthGroupVO authGroupVO);

    /**
     * 권한 그룹 삭제
     * @param autuGroupId
     * @return
     */
    ResultVO deleteAuthGroup(int autuGroupId);

}
