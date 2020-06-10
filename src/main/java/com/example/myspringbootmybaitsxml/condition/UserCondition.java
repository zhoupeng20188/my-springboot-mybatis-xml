package com.example.myspringbootmybaitsxml.condition;

import com.example.myspringbootmybaitsxml.entity.User;
import lombok.Data;

import java.util.List;

/**
 * @Author zp
 * @create 2020/6/10 10:10
 */
@Data
public class UserCondition extends User {
    private List<Integer> ids;
}
