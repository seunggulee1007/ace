package com.inno.ace.model.service.file;

import com.inno.ace.model.dao.ace.FileDao;
import com.inno.ace.model.vo.FileVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @apiNote 파일 서비스
 * @author es-seungglee
 *
 */
@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    
    private final FileDao fileDao;

    /**
     * @apiNote 파일 저장
     * @param fileVO
     * @author es-seungglee
     * 
     */
    @Transactional
    public int insertFile(FileVO fileVO) {
        return fileDao.insertFile(fileVO);
    }
    
    /**
     * @apiNote 파일 리스트 조회
     * @param fileVO
     * @author es-seungglee
     * 
     */
    public List<FileVO> selectFileList(FileVO fileVO) {
        return fileDao.selectFileList(fileVO);
    }
    
    /**
     * 파일 단건 조회
     * @param fileId
     * @return
     */
    public FileVO selectFile(int fileId) {
        return fileDao.selectFile(fileId);
    }
    
    /**
     * 파일 삭제
     * @param fileId
     * @return
     */
    @Transactional
    public int deleteFileByFileId(int fileId) {
        return fileDao.deleteFileByFileId(fileId);
    }
    
    /**
     * 게시글 관련 파일 전체 삭제.
     * @param
     * @return
     */
    @Transactional
    public int deleteFileByRefId(int refId, int refType) {
        return fileDao.deleteFileByBoardId(refId, refType);
    }

}
