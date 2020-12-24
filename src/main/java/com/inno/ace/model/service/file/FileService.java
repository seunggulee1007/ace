package com.inno.ace.model.service.file;



import com.inno.ace.model.vo.FileVO;

import java.util.List;

/**
 * @apiNote 파일 서비스
 * @author es-seungglee
 *
 */
public interface FileService {
    
    /**
     * @apiNote 파일 저장
     * @param fileVO
     * @author es-seungglee
     * @return
     */
    public int insertFile(FileVO fileVO);
    
    /**
     * @apiNote 파일 리스트 조회
     * @param fileVO
     * @author es-seungglee
     * @return
     */
    public List<FileVO> selectFileList(FileVO fileVO);
    
    /**
     * 파일 삭제
     * @param fileId
     * @return
     */
    public int deleteFileByFileId(int fileId);
    
    /**
     * 게시글 관련 파일 전체 삭제.
     * @param refId, refType
     * @return
     */
    public int deleteFileByRefId(int refId, int refType);
    
    /**
     * 파일 단건 조회
     * @param fileId
     * @return
     */
    public FileVO selectFile(int fileId);
    
}
