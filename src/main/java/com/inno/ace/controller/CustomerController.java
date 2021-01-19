package com.inno.ace.controller;

import com.inno.ace.model.service.customer.CustomerService;
import com.inno.ace.model.vo.ClientVO;
import com.inno.ace.model.vo.CustomerVO;
import com.inno.ace.model.vo.PagingVO;
import com.inno.ace.model.vo.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    /**
     * 중복 조회
     * @param customerNm
     * @return
     */
    @GetMapping("/confirmDuple/{customerNm}")
    public ResultVO confirmDuple(@PathVariable String customerNm) {
        return customerService.confirmDuple(customerNm);
    }

    /**
     * 거래처 조회
     * @param customerId
     * @return
     */
    @GetMapping("/{customerId}")
    public ResultVO selectCustomer(@PathVariable int customerId) { return customerService.selectCustomer(customerId);}

    /**
     * 거래처 리스트 조회
     * @param pagingVO
     * @return
     */
    @GetMapping("/customerList")
    public ResultVO selectCustomerList(PagingVO pagingVO) { return customerService.selectCustomerList(pagingVO);}

    /**
     * 거래처 등록
     * @param customerVO
     * @return
     */
    @PostMapping
    public ResultVO insertCustomer(CustomerVO customerVO) {
        return customerService.insertCustomer(customerVO);
    }

    /**
     * 거래처 수정
     * @param customerVO
     * @return
     */
    @PutMapping
    public ResultVO updateCustomer(CustomerVO customerVO) {
        return customerService.updateCustomer(customerVO);
    }

    /**
     * 고객 별 삭제
     * @param customerId
     * @return
     */
    @DeleteMapping("/{customerId}")
    public ResultVO deleteCustomer(@PathVariable int customerId) { return customerService.deleteCustomer(customerId); }

    /**
     * 거래처 별 고객 삭제
     * @param clientId
     * @return
     */
    @DeleteMapping("/client/{clientId}")
    public ResultVO deleteCustomerByClientId(@PathVariable int clientId) { return customerService.deleteCustomerByClientId(clientId); }

}
