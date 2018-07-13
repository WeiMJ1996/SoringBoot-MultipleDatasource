package com.wmj.blog.dao;

import com.wmj.blog.entity.User;

import java.util.List;

public interface UserDao {
    int insert(User record);



    List<User> selectUsers();
}
