package com.inno.ace.model.service.post;

import com.inno.ace.model.vo.PostVO;
import com.inno.ace.model.vo.ResultVO;

public interface PostService {

    public ResultVO selectPost(int postId);
    
    public ResultVO insertPost(PostVO postVO);
    
    public ResultVO selectPostList(String crtId);
    
    public ResultVO deletePost(int postId);
    
    public ResultVO updatePost(PostVO postVO);
    
}
