package com.springbootpart2.service;

public interface UserService {
    public String addUser(String name, String surname);
    public String removeUser(long Id);
    public String getUser(long Id);
}
