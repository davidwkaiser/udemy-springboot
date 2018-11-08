package com.example.rest.demo.controllers;


import com.example.rest.demo.domain.Post;
import com.example.rest.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    private PostService postService;

    @Autowired
    public PostController (PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(){
        return "home page!";
    }

    @RequestMapping("/posts")
    public Iterable<Post> list() {
        return postService.list();
    }

    @PostMapping("/posts")
    public Post create(@RequestBody Post post){
        return postService.create(post);
    }

    @RequestMapping("/posts/{id}")
    public Post read(@PathVariable(value="id") Long id){
        Optional<Post> response = postService.read(id);
        return response.isPresent() ? response.get() : null;
    }

    @PutMapping("/posts/{id}")
    public Post update(@RequestBody Post post, @PathVariable long id){
        return postService.update(id, post);
    }

    @DeleteMapping("/posts/{id}")
    public void delete(@PathVariable(value="id") Long id){
        postService.delete(id);
    }

}
