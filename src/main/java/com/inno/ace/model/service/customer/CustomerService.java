package com.inno.ace.model.service.customer;

import com.inno.ace.model.vo.admin.CustomerVO;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;

public interface CustomerService {

    /**
     * 고객 명 중복 확인
     * @param customerNm
     * @return
     */
    ResultVO confirmDuple(String customerNm);

    /**
     * 거래처 별 고객 조회
     * @param pagingVO
     * @return
     */
    ResultVO selectCustomerList(PagingVO pagingVO);

    /**
     * 고객 아이디로 고객 조회
     * @param customerId
     * @return
     */
    ResultVO selectCustomer(int customerId);

    /**
     * 고객 등록
     * @param customerVO
     * @return
     */
    ResultVO insertCustomer(CustomerVO customerVO);

    /**
     * 고객 수정
     * @param customerVO
     * @return
     */
    ResultVO updateCustomer(CustomerVO customerVO);

    /**
     * 고객 삭제
     * @param customerId
     * @return
     */
    ResultVO deleteCustomer(int customerId);

    /**
     * 고객 삭제
     * @param clientId
     * @return
     */
    ResultVO deleteCustomerByClientId(int clientId);

}
