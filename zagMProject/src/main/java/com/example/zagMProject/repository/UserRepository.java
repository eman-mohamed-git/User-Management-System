package com.example.zagMProject.repository;

import com.example.zagMProject.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users=new ArrayList<>();

    public User getUserById(Integer id){
        for (User user:users){
            if(user.getUserId().equals(id))
                return user;
        }
        return null;
    }
}
