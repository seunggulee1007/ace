package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.CustomerVO;
import com.inno.ace.model.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CustomerDao {

    /**
     * 중복 여부 체크
     * @param customerNm
     * @return
     */
    int confirmDuple(String customerNm);

    int selectCustomerCnt(PagingVO pagingVO);

    /**
     * 거래처 별 고객 조회
     * @param pagingVO
     * @return
     */
    List<CustomerVO> selectCustomerList(PagingVO pagingVO);

    /**
     * 고객 아이디로 고객 조회
     * @param customerId
     * @return
     */
    Optional<CustomerVO> selectCustomer(int customerId);

    /**
     * 고객 등록
     * @param customerVO
     * @return
     */
    int insertCustomer(CustomerVO customerVO);

    /**
     * 고객 수정
     * @param customerVO
     * @return
     */
    int updateCustomer(CustomerVO customerVO);

    /**
     * 고객 삭제
     * @param customerId
     * @return
     */
    int deleteCustomer(int customerId);

    /**
     * 거래처 별 고객 전체 삭제
     * @param clientId
     * @return
     */
    int deleteCustomerByClientId(int clientId);

}
