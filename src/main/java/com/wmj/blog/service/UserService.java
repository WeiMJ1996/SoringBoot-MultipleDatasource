package com.wmj.blog.service;

import com.github.pagehelper.PageInfo;
import com.wmj.blog.entity.User;

public interface UserService {
    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
