package com.example.zagMProject.modeltest;


import com.example.zagMProject.model.User;
import com.example.zagMProject.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
public class UserTest {

    @Test
    public void testUser() {
        User user = new User(1, "alimohamed", "2468", "alimohamed@yahoo.com",
                "Ali Mohamed", "1234560", "Admin", "Male", "Active");

//        assertEquals(1, user.getUserId());
        assertEquals("alimohamed", user.getUserUsername());
        assertEquals("2468", user.getUserPassword());
        assertEquals("alimohamed@yahoo.com", user.getUserEmail());
        assertEquals("Ali Mohamed", user.getUserFullName());
        assertEquals("1234560", user.getUserMobileNumber());
        assertEquals("Admin", user.getUserRole());
        assertEquals("Male", user.getUserGender());
        assertEquals("Active", user.getUserStatus());
    }

    @Test
    public void testEqualsAndHashCode() {
        User user1 = new User(1, "alimohamed", "2468", "alimohamed@yahoo.com",
                "Ali Mohamed", "1234560", "Admin", "Male", "Active");

        User user2 = new User(1, "tamermohamed", "2468", "tamermohamed@yahoo.com",
                "Tamer Mohamed", "1235560", "Admin", "Male", "Active");

        assertEquals(user1, user2);
        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Autowired
    private UserService userService;

    @Test
    public void testFindUserById(){
        User user = new User(1, "nourmohamed", "1234", "nourmohamed@gmail.com", "Noor Mohamed",
                    "012002355", "Admin", "Female", "activate");



    }
}
