package com.example.Test07.service;

import com.example.Test07.model.Post;
import com.example.Test07.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private IPostRepository iPostRepository;
    public Post addPost(Post post) {
        return iPostRepository.save(post);
    }

    public List<Post> getAll() {
        return iPostRepository.findAll();
    }
}
