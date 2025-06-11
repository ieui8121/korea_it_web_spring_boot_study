package com.koreait.spring_boot_study.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    public String getPost() {
        return "서비스에서 보낸 어떠한 게시물의 데이터";
    }
}
