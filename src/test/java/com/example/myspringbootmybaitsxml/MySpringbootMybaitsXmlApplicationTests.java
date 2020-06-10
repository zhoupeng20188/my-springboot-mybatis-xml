package com.example.myspringbootmybaitsxml;

import com.example.myspringbootmybaitsxml.entity.Department;
import com.example.myspringbootmybaitsxml.mapper.DepartmentMapper;
import com.example.myspringbootmybaitsxml.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpringbootMybaitsXmlApplicationTests {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void getDepsUser() {
        Department depsUser = departmentMapper.getDepsUser(1);
        System.out.println(depsUser);
    }

}
