package com.example.Test07.controller;

import com.example.Test07.model.Post;
import com.example.Test07.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @Autowired
    private PostService postService;
    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post post){
        return postService.addPost(post);
    }
    @GetMapping("/getPosts")
    public List<Post> getAllPosts(){
        return postService.getAll();
    }
}
