package com.inno.ace.model.service.profile;

import com.inno.ace.model.dao.ace.FileDao;
import com.inno.ace.model.dao.ace.ProfileDao;
import com.inno.ace.model.vo.FileVO;
import com.inno.ace.model.vo.ProfileVO;
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
public class ProfileServiceImpl implements ProfileService {
    
    private final ProfileDao profileDao;

    /**
     * @apiNote 파일 저장
     * @param profileVO
     * @author es-seungglee
     * 
     */
    @Transactional
    public int insertProfile(ProfileVO profileVO) {
        return profileDao.insertProfile(profileVO);
    }

    /**
     * 파일 단건 조회
     * @param profileId
     * @return
     */
    public ProfileVO selectProfile(int profileId) {
        return profileDao.selectProFile(profileId);
    }
    
    /**
     * 파일 삭제
     * @param profileId
     * @return
     */
    @Transactional
    public int deleteFileByFileId(int profileId) {
        return profileDao.deleteProfileByProfileId(profileId);
    }

    @Transactional
    public int deleteFileByUserId(String userId) {return profileDao.deleteProfileByUserId(userId);}

}
