package com.epam.training.dao.user;

import com.epam.training.model.user.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    User getUserById(long userId);

    User createUser(User user);

    User updateUser(User user);

    boolean deleteUser(long userId);

    List<User> findAll();

    Map<Long, User> getUsers();
}
