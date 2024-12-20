package com.example.zagMProject.service;


import com.example.zagMProject.Feature;
import com.example.zagMProject.model.User;
import com.example.zagMProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements Feature {
    // arrayaslist make it final cant delete or add
    private List<User> users = new ArrayList<>(Arrays.asList(
        new User(1,"mohamed11","11mmoogg","mohamed@wagih.com","mohamed wagih","0102363466","head","male","active")));

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void Create(User user) {
        users.add(user);
    }

    @Override
    public void Update(User user , int id) {
        boolean isupdated =false;
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getUserId()==id){
                users.set(i,user);
                isupdated = true;
                System.out.println("is updated");
                break;
            }

        }
    }

    @Override
    public User GetUserDetails(int id) {

        for(int i=0; i<users.size(); i++){
            if(users.get(i).getUserId()==id){


                id = i; // change value of id to index
                break;
            }

        }
        return users.get(id);

    }

    @Override
    public void Delete(int id) {
        boolean isdeleted = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserId().equals(id)) {
                users.remove(users.get(i));
                isdeleted = true;
               // System.out.println("is Deleted");
                break;
            }
        }
    }

    @Override
    public List<User> Filter(String status, String role) {

        return users.stream().filter(user -> ( user.getUserStatus().equalsIgnoreCase(status))&&(user.getUserRole().equalsIgnoreCase(role))).collect(Collectors.toUnmodifiableList());
        // filter the null and what i will pass .equalsIgnoreCase compare without look at capital or small
    }

    @Override
    public List<User> GetAllUsers() {
        return users;
    }



    public String getHelloMessage(){
        return "Hello, Welcome to Spring Boot App";
    }

    public User findUserById(Integer id) {
        return new User(1, "noormohamed", "2468", "noormohamed@yahoo.com",
                "Noor Mohamed", "1235560", "Admin", "Female", "Active");

    }
}


