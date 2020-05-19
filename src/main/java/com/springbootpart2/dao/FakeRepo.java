package com.springbootpart2.dao;

import com.springbootpart2.service.FakeRepoInterface;
import com.springbootpart2.model.User;
import org.stereotype.Repository;

import java.util.HashMap;

@Repository
public class FakeRepo implements FakeRepoInterface {

    HashMap<Long, User> user = new HashMap<Long, User>();
    public long database(){
        user.put((long)1,new User(1, "Rotondwa", "Netshimbupfe"));
        user.put((long)2,new User(2, "Lufuno", "Madima"));
        user.put((long)3,new User(3, "Madima", "Nevhuhulwi"));

        return user.size();
    }

    //Adds user data into a database
    @Override
    public User insertUser(long id, String name, String surname) {
        user.put(id,new User(id,name,surname));
        return user.get(id);
    }

    //Find user using id
    @Override
    public User findUserById(long id) {
        return user.get(id);
    }

    //Delete user using id
    @Override
    public User deleteUser(long id) {
        return user.remove(id);
    }
}
