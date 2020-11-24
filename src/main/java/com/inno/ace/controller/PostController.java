package com.inno.ace.controller;

import com.inno.ace.model.service.post.PostService;
import com.inno.ace.model.vo.PostVO;
import com.inno.ace.model.vo.ResultVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {
    
    private final PostService postService;
    
    @ApiImplicitParams({
        @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header")
    })
    @ApiOperation(value="게시글 조회", notes="아이디로 게시글 조회")
    @GetMapping("/posts/{crtId}")
    public ResultVO posts(@PathVariable String crtId) {
        return postService.selectPostList(crtId);
    }
    
    @ApiImplicitParams({
        @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header")
    })
    @PostMapping("/post")
    public ResultVO post(PostVO postVO) {
        return postService.insertPost(postVO);
    }
    
    @ApiImplicitParams({
        @ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header")
    })
    @GetMapping("/post/{postId}")
    public ResultVO getPost(@PathVariable int postId) {
        return postService.selectPost(postId);
    }
    
    @DeleteMapping("/post/{postId}")
    public ResultVO deletePost(@PathVariable int postId) {
        return postService.deletePost(postId);
    }
    
    @PutMapping("/post")
    public ResultVO updatePost(PostVO postVO) {
        return postService.updatePost(postVO);
    }
}
