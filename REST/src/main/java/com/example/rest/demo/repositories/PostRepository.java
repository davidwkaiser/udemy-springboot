package com.example.rest.demo.repositories;

import com.example.rest.demo.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
