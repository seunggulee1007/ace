package com.inno.ace.model.dao.ace;

import com.inno.ace.model.vo.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostDao {

    public Optional<PostVO> selectPost(int postId);
    
    public int insertPost(PostVO postVO);
    
    public List<PostVO> selectPostList(String crtId);
    
    public int deletePost(int postId);
    
    public int updatePost(PostVO postVO);
    
}
