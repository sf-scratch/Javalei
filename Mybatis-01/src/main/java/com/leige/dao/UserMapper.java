package com.leige.dao;

import com.leige.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserId(int i);
    int addUser(User user);
    int updateUser(User user);
    int deleteUserById(int id);

}
