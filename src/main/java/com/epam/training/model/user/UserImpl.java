package com.epam.training.model.user;

import lombok.Data;

@Data
public class UserImpl implements User {

    long id;
    private String name;
    private String email;

    public UserImpl(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
