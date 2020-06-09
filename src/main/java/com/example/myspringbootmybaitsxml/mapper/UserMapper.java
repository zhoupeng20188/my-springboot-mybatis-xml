package com.example.myspringbootmybaitsxml.mapper;

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
public interface UserMapper {
    /**
     * 普通一览
     * @param userName
     * @param nickName
     * @return
     */
    public List<User> getUserByUserNameAndNickName(String userName, String nickName);

    /**
     * 普通单条
     * @param id
     * @return
     */
    public User getUserById(int id);

    /**
     * 不定义对象接收时的写法（单条）
     * @param id
     * @return
     */
    public Map<String,Object> getUserMapById(int id);

    /**
     * 不定义对象接收时的写法（多条）
     * @MapKey指定的是Map的Integer对应的值
     * @param userName
     * @param nickName
     * @return
     */
    @MapKey("user_id")
    public Map<Integer,Object> getUserMapByUserNameAndNickName(String userName, String nickName);

    /**
     * 关联查询 级联属性
     * @param id
     * @return
     */
    public User getUserAndDepById(int id);

    /**
     * 分步查询
     * @param id
     * @return
     */
    User getUserAndDepByStep(int id);
}
