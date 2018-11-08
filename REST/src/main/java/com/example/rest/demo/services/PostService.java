package com.example.rest.demo.services;

import com.example.rest.demo.domain.Post;
import com.example.rest.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService (PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> list() {
        return postRepository.findAll();
    }

    public Post create(Post post) {
        return postRepository.save(post);
    }

    public Optional<Post> read(Long id){
        return postRepository.findById(id);
    }

    public Post update(long id, Post post) {
        post.setId(id);
        return postRepository.save(post);
    }

    public void delete(Long id) {
        postRepository.deleteById(id);
    }
}
