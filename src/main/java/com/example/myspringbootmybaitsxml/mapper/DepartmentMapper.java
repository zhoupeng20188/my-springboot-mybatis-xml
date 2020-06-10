package com.example.myspringbootmybaitsxml.mapper;

import com.example.myspringbootmybaitsxml.entity.Department;
import com.example.myspringbootmybaitsxml.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author zp
 * @create 2020/6/9 9:57
 */
@Mapper
public interface DepartmentMapper {

    /**
     * 普通单条
     * @param id
     * @return
     */
    Department getDepartmentById(int id);

    /**
     * 分步查询（collection）
     * @param id
     * @return
     */
    Department getDepsUser(int id);
}
