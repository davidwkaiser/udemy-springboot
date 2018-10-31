package com.example.rest.demo.services;

import com.example.rest.demo.domain.Post;
import com.example.rest.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService () {
        this.postRepository = postRepository;
    }

    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }
}
