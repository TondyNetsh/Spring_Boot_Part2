package com.springbootpart2.controller;

import com.springbootpart2.dao.FakeRepo;
import com.springbootpart2.service.UserService;
import com.springbootpart2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping(path="/springbootpart2")
public class UserServiceImpl implements UserService {

    @Autowired
    FakeRepo fakeRepo; // instantiate FakeRepo class

    @Override
    //Adds a new user information
    public String addUser(String name, String surname) {
        //Calls a insertUser method from FakeRepo class
        User user = fakeRepo.insertUser(fakeRepo.database() + 1,name,surname);

        // Get name and surname from User class
        name = user.getName() + " " + user.getSurname() + " entered";

        return name;
    }

    @Override
    //Removes a selected username
    public String removeUser(long Id) {
        //Calls a removeUser method from FakeRepo class
        User user = fakeRepo.deleteUser(Id);

        // Get the name and surname from User class
        String name = user.getName() + " " + user.getSurname() + " deleted";

        return name;
    }

    @Override
    @GetMapping(path="/getUser")
    //Print out a selected username
    public String getUser(long Id) {
        //Calls a getUser method from FakeRepo class
        User user = fakeRepo.findUserById(Id);

        // Get name and surname from User class
        String name = "Hello " + user.getName() + " " + user.getSurname();

        return name;
    }
}
