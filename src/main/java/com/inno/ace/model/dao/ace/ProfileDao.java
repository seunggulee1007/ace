package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.FileVO;
import com.inno.ace.model.vo.ProfileVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 파일 매퍼
 * @author es-seungglee
 *
 */
@Mapper
public interface ProfileDao {
    
    /**
     * @apiNote @apiNote 파일 저장
     * @param profileVO
     * @author es-seungglee
     * @return
     */
    int insertProfile(ProfileVO profileVO);

    /**
     * 파일 단건 조회
     * @param profileId
     * @return
     */
    ProfileVO selectProFile(int profileId);
    
    /**
     * 파일 삭제
     * @param profileId
     * @return
     */
    int deleteProfileByProfileId(int profileId);

    /**
     * 사용자 아이디 관련 파일 삭제
     * @param userId
     * @return
     */
    int deleteProfileByUserId(String userId);

}
