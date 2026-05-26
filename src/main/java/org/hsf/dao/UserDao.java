package org.hsf.dao;

import org.hsf.entities.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User createUser(User user);
}
