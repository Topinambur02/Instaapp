package com.example.entity;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;

public class Post {

    private Long id;
    private String title;
    private String text;
    private LocalDateTime createdDate;

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}
