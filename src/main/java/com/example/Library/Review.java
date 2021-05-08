package com.example.Library;

import org.springframework.stereotype.Component;

@Component
public class Review {
    public Review(String nickName, String content) {
        this.nickName = nickName;
        this.content = content;
    }

    String nickName;
    String content;
}
