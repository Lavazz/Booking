package com.epam.training.service.user;

import com.epam.training.model.user.User;
import com.epam.training.model.user.UserImpl;
import com.epam.training.storage.user.UserStorage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {

    ApplicationContext context;
    UserStorage bookingStorage;
    UserService userService;
    User user;

    public UserServiceTest() {}

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("spring.xml");
        userService = context.getBean(UserService.class);
        bookingStorage = context.getBean("userStorage", UserStorage.class);
        user = Mockito.mock(UserImpl.class);
    }

    @Test
    public void getUserByIdTest() {
        Assert.assertEquals(user, userService.createUser(user));
        Assert.assertEquals(user, userService.getUserById(user.getId()));
    }

    @Test(expected = IllegalStateException.class)
    public void getNotExistingUserByIdTest() {
        userService.getUserById(1000L);
    }


    @Test(expected = IllegalStateException.class)
    public void getNotExistingUserByEmailTest() {
        userService.getUserByEmail("test@gmail.com");
    }

    @Test
    public void getUsersByNameTest() {
        Assert.assertNotNull(userService.getUsersByName("Jack", 1, 1));
    }

    @Test
    public void createUserTest() {
        Assert.assertEquals(user, userService.createUser(user));
    }


    @Test
    public void updateUserTest() {
        userService.createUser(user);
        Assert.assertEquals(user, userService.updateUser(user));
    }

    @After
    public void cleanUp() {
        bookingStorage.cleanStorage();
    }
}