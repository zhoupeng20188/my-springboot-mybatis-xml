package com.example.myspringbootmybaitsxml.controller;

import com.example.myspringbootmybaitsxml.entity.User;
import com.example.myspringbootmybaitsxml.mapper.DepartmentMapper;
import com.example.myspringbootmybaitsxml.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author zp
 * @create 2020/6/9 10:02
 */
@RestController
public class IndexController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/index")
    public List<User> getUserList(String userName, String nickName){
        return  userMapper.getUserByUserNameAndNickName(userName, nickName);
    }
    @RequestMapping("/list")
    public Map<Integer, Object> getUserList2(String userName, String nickName){
        return  userMapper.getUserMapByUserNameAndNickName(userName, nickName);
    }
    @RequestMapping("/user")
    public User getUser(int id){
        return  userMapper.getUserById(id);
    }

    @RequestMapping("/userMap")
    public Map<String, Object> getUserMap(int id){
        return  userMapper.getUserMapById(id);
    }
    @RequestMapping("/userDep")
    public User getUserDepMap(int id){
        return  userMapper.getUserAndDepById(id);
    }

    @RequestMapping("/userDepByStep")
    public User userDepByStep(int id){
        return  userMapper.getUserAndDepByStep(id);
    }

    @RequestMapping("/update")
    public void update(int id){
        userMapper.update(id);
    }

    @RequestMapping("/like")
    public List<User> like(String userName){
        return userMapper.selectTest(userName);
    }

}
