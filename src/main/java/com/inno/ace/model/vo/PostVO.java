package com.inno.ace.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class PostVO {

    @ApiModelProperty(value="글 아이디")
    private int postId;
    @ApiModelProperty(value="제목")
    private String title;
    @ApiModelProperty(value="내용")
    private String contents;
    @ApiModelProperty(value="등록자")
    private String crtId;
    @ApiModelProperty(value="등록일자")
    private String crtDtm;
    @ApiModelProperty(value="수정일자")
    private String chgDtm;
    
}
