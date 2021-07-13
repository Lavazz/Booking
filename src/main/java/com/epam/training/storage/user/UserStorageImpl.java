package com.epam.training.storage.user;

import com.epam.training.model.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStorageImpl implements UserStorage {

    private final Map<Long, User> userMap;

    public UserStorageImpl() {
        userMap = new HashMap<>();
    }

    @Override
    public User getUserById(long userId) {
        return userMap.get(userId);
    }

    @Override
    public User createUser(User user) {
        return userMap.put(user.getId(), user);
    }

    @Override
    public User updateUser(User user) {
        return userMap.replace(user.getId(), user);
    }

    @Override
    public boolean deleteUser(long userId) {
        return userMap.remove(userId) != null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    public void cleanStorage() {
        userMap.clear();
    }

    @Override
    public Map<Long, User> getUsers() {
        return userMap;
    }
}
