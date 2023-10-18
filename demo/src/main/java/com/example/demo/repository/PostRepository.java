package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
    
    List<Post> findAllByUserOrderByCreateDateDesc(User user);
    List<Post> findAllByOrderByCreatedDateDesc();
    Optional<Post> findPostByIdAndUser(Long id, User user);

}
