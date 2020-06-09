package com.example.myspringbootmybaitsxml.entity;

import lombok.Data;

/**
 * @Author zp
 * @create 2020/6/9 9:56
 */
@Data
public class User {
    private int userId;
    private String userName;
    private String nickName;
    private int sex;
    private String address;
    private Department dep;
}
