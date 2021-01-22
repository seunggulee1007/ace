package com.inno.ace.model.service.work.workuser;

import com.inno.ace.model.vo.common.ResultVO;
import com.inno.ace.model.vo.flexibleWork.WorkUserVO;

public interface WorkUserService {

    /**
     * 근무 직원 등록
     * @param workUserVO
     * @return
     */
    ResultVO insertWorkUser(WorkUserVO workUserVO);

    /**
     * 근무 직원 삭제
     * @param workUserId
     * @return
     */
    ResultVO deleteWorkUser(int workUserId);

    /**
     * 근무 직원 삭제
     * @param workGroupId
     * @return
     */
    ResultVO deleteWorkUserByWorkGroupId(int workGroupId);

}
