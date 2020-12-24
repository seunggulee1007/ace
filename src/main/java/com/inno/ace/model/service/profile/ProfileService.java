package com.inno.ace.model.service.profile;


import com.inno.ace.model.vo.ProfileVO;

/**
 * @apiNote 파일 서비스
 * @author es-seungglee
 *
 */
public interface ProfileService {
    
    /**
     * @apiNote 파일 저장
     * @param profileVO
     * @author es-seungglee
     * @return
     */
    int insertProfile(ProfileVO profileVO);

    /**
     * 파일 삭제
     * @param profileId
     * @return
     */
    int deleteFileByFileId(int profileId);

    /**
     * 파일 단건 조회
     * @param profileId
     * @return
     */
    ProfileVO selectProfile(int profileId);
    
}
