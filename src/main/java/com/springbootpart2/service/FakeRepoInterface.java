package com.springbootpart2.service;

import com.springbootpart2.model.User;

public interface FakeRepoInterface{
    public User insertUser(long id, String name, String surname);
    public User findUserById(long id);
    public User deleteUser(long id);
}
