package com.inno.ace.model.service.admin.dept;

import com.inno.ace.enums.CommonMsg;
import com.inno.ace.model.dao.ace.admin.DeptDao;
import com.inno.ace.model.vo.admin.DeptVO;
import com.inno.ace.model.vo.common.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DeptServiceImpl implements DeptService {

    private final DeptDao deptDao;

    /**
     * 부서 리스트 조회
     * @return
     */
    public ResultVO selectDeptList() {
        List<DeptVO> deptList = deptDao.selectDeptList();
        for(DeptVO deptVO : deptList) {
            deptVO.setChildren(deptList.stream().filter(dept -> dept.getDeptId() != 0 && dept.getParDeptId()== deptVO.getDeptId()).collect(Collectors.toList()));
        }
        deptList = deptList.stream()
                .filter(dept -> 0 == dept.getDeptId())
                .collect(Collectors.toList())
                ;
        return ResultVO.builder().data(deptList).build();
    }

    /**
     * 부서 조회
     * @param deptId
     * @return
     */
    public ResultVO selectDept(int deptId) {
        return ResultVO.builder().data(deptDao.selectDept(deptId).orElseGet(DeptVO::new)).build();
    }

    /**
     * 부서 등록
     * @param deptVO
     * @return
     */
    @Transactional
    public ResultVO insertDept(DeptVO deptVO) {
        int result = 0;
        String resultMsg = CommonMsg.SUCCESS_WRITE.getMsg();
        DeptVO tempDeptVO = deptDao.selectOrdAndDeptId(deptVO.getParDeptId()).orElseGet(DeptVO::new);
        System.err.println(tempDeptVO.toString());
        deptVO.setDeptId(tempDeptVO.getDeptId());
        deptVO.setOrd(tempDeptVO.getOrd());
        if(deptDao.insertDept(deptVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_WRITE.getMsg();
        }

        return ResultVO.builder().result(result).resultMsg(resultMsg).data(deptVO).build();
    }

    /**
     * 부서
     * @param deptVO
     * @return
     */
    @Transactional
    public ResultVO updateDept(DeptVO deptVO) {

        int result = 0;
        String resultMsg = CommonMsg.SUCCESS_MODIFY.getMsg();
        if(deptDao.updateDept(deptVO) < 1) {
            result = -1;
            resultMsg = CommonMsg.FAIL_MODIFY.getMsg();
        }

        return ResultVO.builder().result(result).resultMsg(resultMsg).data(deptVO).build();
    }

    /**
     * 부서 순서 변경
     * @param gu
     * @param ord
     * @param parDeptId
     * @return
     */
    @Transactional
    public ResultVO updateOrd(int gu, int ord, int parDeptId) {
        List<DeptVO> deptList = deptDao.selectDeptListByParDeptId(parDeptId);
        DeptVO deptVO = deptList.get(ord-1);    // 해당 순번에 있는 메뉴 꺼내오기
        deptList.remove(ord-1);           // 꺼낸 메뉴 삭제
        int chgOrd = ord;
        switch (gu) {
            case 1:
                // 순번을 최상위로 변경
                chgOrd = 0;
                break;
            case 2:
                // 순번을 하나 위로 변경
                chgOrd = ord-2;
                break;
            case 3 :
                // 순번을 하나 아래로 변경
                chgOrd = ord;
                break;
            case 4:
                chgOrd = deptList.size();
                break;
        }
        deptList.add(chgOrd, deptVO);
        for(int i=0; i<deptList.size(); i++) {
            deptList.get(i).setOrd(i+1);
            deptDao.updateOrd(deptList.get(i).getOrd(), deptList.get(i).getDeptId());
        }
        return ResultVO.builder().data(chgOrd).build();
    }

    /**
     * 부서 삭제
     * @param deptId
     * @return
     */
    @Transactional
    public ResultVO deleteDept(int deptId) {
        deptDao.deleteDept(deptId);
        return ResultVO.builder().resultMsg(CommonMsg.SUCCESS_DELETE.getMsg()).build();
    }

}
