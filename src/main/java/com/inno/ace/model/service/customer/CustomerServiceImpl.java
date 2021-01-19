package com.inno.ace.model.service.customer;

import com.inno.ace.advice.exception.DuplicationException;
import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.ClientDao;
import com.inno.ace.model.dao.ace.CustomerDao;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.CustomerVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDao customerDao;

    /**
     * 고객 명 중복 확인
     * @param customerNm
     * @return
     */
    public ResultVO confirmDuple(String customerNm) {
        int dupleCnt = customerDao.confirmDuple(customerNm);
        if(dupleCnt > 0) {
            throw new DuplicationException();
        }
        return ResultVO.builder().resultMsg(CommonMsg.AVALIABLE_CLIENT.getMsg()).build();
    }

    /**
     * 거래처 별 고객 조회
     * @param pagingVO
     * @return
     */
    public ResultVO selectCustomerList(PagingVO pagingVO) {
        pagingVO.calcPage(customerDao.selectCustomerCnt(pagingVO));
        return ResultVO.builder().data(customerDao.selectCustomerList(pagingVO)).build();
    }

    /**
     * 고객 아이디로 고객 조회
     * @param customerId
     * @return
     */
    public ResultVO selectCustomer(int customerId) {
        return ResultVO.builder().data(customerDao.selectCustomer(customerId).orElseGet(CustomerVO::new)).build();
    }

    /**
     * 고객 등록
     * @param customerVO
     * @return
     */
    public ResultVO insertCustomer(CustomerVO customerVO) {
        long result = 0;
        confirmDuple(customerVO.getCustomerNm());
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        if(customerDao.insertCustomer(customerVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 고객 수정
     * @param customerVO
     * @return
     */
    public ResultVO updateCustomer(CustomerVO customerVO) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_MODIFY.getMsg();
        if(customerDao.updateCustomer(customerVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 고객 삭제
     * @param customerId
     * @return
     */
    public ResultVO deleteCustomer(int customerId) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_DELETE.getMsg();
        if(customerDao.deleteCustomer(customerId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

    /**
     * 고객 삭제
     * @param clientId
     * @return
     */
    public ResultVO deleteCustomerByClientId(int clientId) {
        long result = 0;
        String resultMsg = CommonMsg.SUCCESS_DELETE.getMsg();
        if(customerDao.deleteCustomerByClientId(clientId) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_DELETE.getMsg();
        }
        return ResultVO.builder().result(result).resultMsg(resultMsg).build();
    }

}
