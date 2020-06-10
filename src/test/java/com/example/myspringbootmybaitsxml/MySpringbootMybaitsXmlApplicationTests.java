package com.example.myspringbootmybaitsxml;

import com.example.myspringbootmybaitsxml.condition.UserCondition;
import com.example.myspringbootmybaitsxml.entity.Department;
import com.example.myspringbootmybaitsxml.entity.User;
import com.example.myspringbootmybaitsxml.mapper.DepartmentMapper;
import com.example.myspringbootmybaitsxml.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MySpringbootMybaitsXmlApplicationTests {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void test01() {
        Department depsUser = departmentMapper.getDepsUser(1);
        System.out.println(depsUser);
    }

    @Test
    void test02() {
        UserCondition userCondition = new UserCondition();
        userCondition.setIds(Arrays.asList(1,2));
        userCondition.setUserName("1");
//        userCondition.setNickName("22");
        List<User> list = userMapper.getUserByCondition(userCondition);
        System.out.println(list);
    }

}
