package com.koreait.spring_boot_study.dto;

import lombok.Data;

@Data
public class SighupReqDto {
    private String username;
    private String password;
    private String email;
}
