package com.example.demo;

import java.util.ArrayList;

public class UserService {
    private ArrayList<User> usersList = new ArrayList<>();

    public void addUser(User user) {
        usersList.add(user);
    }

    public ArrayList<User> getUsers() {
        return usersList;
    }
}
