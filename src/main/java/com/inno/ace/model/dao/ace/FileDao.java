package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.FileVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 파일 매퍼
 * @author es-seungglee
 *
 */
@Mapper
public interface FileDao {
    
    /**
     * @apiNote @apiNote 파일 저장
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
     * 파일 단건 조회
     * @param fileId
     * @return
     */
    public FileVO selectFile(int fileId);
    
    /**
     * 파일 삭제
     * @param fileId
     * @return
     */
    public int deleteFileByFileId(int fileId);
    
    /**
     * 게시글 관련 파일 전체 삭제
     * @param
     * @return
     */
    public int deleteFileByBoardId(int refId, int refType);
    
}
