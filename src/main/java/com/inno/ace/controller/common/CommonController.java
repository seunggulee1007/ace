package com.inno.ace.controller.common;

import com.inno.ace.model.service.admin.code.CodeService;
import com.inno.ace.model.service.admin.menu.MenuService;
import com.inno.ace.model.vo.common.ResultVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/common")
public class CommonController {

    private final MenuService menuService;

    private final CodeService codeService;

    @GetMapping("/code/{codeGroup}")
    public ResultVO selectCodeList(@PathVariable String codeGroup) {
        Map<String, Object> map = new HashMap<>();
        if(codeGroup.indexOf(",") != -1) {
            String [] codeGroups = codeGroup.split(",");
            for(String group : codeGroups) {
                map.put(group, codeService.selectCodeListByCodeMasterNm(group));
            }
        }else {
            map.put(codeGroup, codeService.selectCodeListByCodeMasterNm(codeGroup));
        }
        return ResultVO.builder().data(map).build();
    }

}
