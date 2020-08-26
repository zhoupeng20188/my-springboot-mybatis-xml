package com.example.myspringbootmybaitsxml.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zp
 * @create 2020/6/9 9:56
 */
@Data
public class Department implements Serializable {
    private int depId;
    private String depName;
    private List<User> user;
}
