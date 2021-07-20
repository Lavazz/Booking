package com.epam.training.dao.user;

import com.epam.training.model.user.User;
import com.epam.training.storage.user.UserStorage;
import com.epam.training.storage.user.UserStorageImpl;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private final UserStorage userStorage;

    public UserDaoImpl(UserStorageImpl userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public User getUserById(long userId) {
        return userStorage.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        return userStorage.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userStorage.updateUser(user);
    }

    @Override
    public boolean deleteUser(long userId) {
        return userStorage.deleteUser(userId);
    }

    @Override
    public List<User> findAll() {
        return userStorage.findAll();
    }

}
