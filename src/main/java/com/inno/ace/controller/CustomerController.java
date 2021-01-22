package com.inno.ace.controller;

import com.inno.ace.model.service.customer.CustomerService;
import com.inno.ace.model.vo.admin.CustomerVO;
import com.inno.ace.model.vo.common.PagingVO;
import com.inno.ace.model.vo.common.ResultVO;
import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value="중복 조회", notes="고객명 중복 조회")
    public ResultVO confirmDuple(@PathVariable String customerNm) {
        return customerService.confirmDuple(customerNm);
    }

    /**
     * 고객 조회
     * @param customerId
     * @return
     */
    @GetMapping("/{customerId}")
    @ApiOperation(value="고객 조회", notes="고객 아이디로 고객 조회")
    public ResultVO selectCustomer(@PathVariable int customerId) { return customerService.selectCustomer(customerId);}

    /**
     * 고객 리스트 조회
     * @param pagingVO
     * @return
     */
    @GetMapping("/customerList")
    @ApiOperation(value="고객 리스트 조회", notes="고객 리스트 조회")
    public ResultVO selectCustomerList(PagingVO pagingVO) { return customerService.selectCustomerList(pagingVO);}

    /**
     * 고객 등록
     * @param customerVO
     * @return
     */
    @PostMapping
    @ApiOperation(value="고객 등록", notes="고객 등록")
    public ResultVO insertCustomer(CustomerVO customerVO) {
        return customerService.insertCustomer(customerVO);
    }

    /**
     * 고객 수정
     * @param customerVO
     * @return
     */
    @PutMapping
    @ApiOperation(value="고객 수정", notes="고객 수정")
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
