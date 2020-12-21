package com.inno.ace.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class RouterVO {
    
    private String path;

    private String name;

    private String component;
    
}
