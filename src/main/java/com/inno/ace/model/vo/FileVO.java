package com.inno.ace.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @apiNote 파일 vo
 * @author es-seungglee
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileVO {

    private int fileId;
    
    private String fileNm;
    
    private String originalFileNm;
    
    private String filePath;
    
    private long fileSize;
    
    private String contentType;
    
    private String extention;
    
    private Date crtDate;
    
    private int refId;
    
    private int refType;
    
}
