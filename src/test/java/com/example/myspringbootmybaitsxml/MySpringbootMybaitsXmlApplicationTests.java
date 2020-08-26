package com.example.myspringbootmybaitsxml;

import com.example.myspringbootmybaitsxml.condition.UserCondition;
import com.example.myspringbootmybaitsxml.entity.Department;
import com.example.myspringbootmybaitsxml.entity.User;
import com.example.myspringbootmybaitsxml.mapper.DepartmentMapper;
import com.example.myspringbootmybaitsxml.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
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

    @Test
    void test03(){
        List<User> users = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            User user = new User();
            user.setUserId(i);
            user.setUserName("userName"+i);
            user.setNickName("nickName"+i);
            user.setAddress("address"+i);
            user.setSex(0);
            users.add(user);
        }
        userMapper.multiInsert(users);

    }

    @Test
    void test04(){
        long start = System.currentTimeMillis();
        User user = userMapper.getUserAndDepById(1);
        System.out.println(user);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Test
    void test05(){
        long start = System.currentTimeMillis();
        User user = userMapper.getUserAndDepByStep(1);
        System.out.println(user);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
