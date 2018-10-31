package com.example.rest.demo.controllers;


import com.example.rest.demo.domain.Post;
import com.example.rest.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;
    
    @Autowired
    public PostController (PostService postService) {
        this.postService = postService;
    }
    @RequestMapping("/posts")
    public Iterable<Post> getPosts() {
        return postService.getPosts();
    }


}
