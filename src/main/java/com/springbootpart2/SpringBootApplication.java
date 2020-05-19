package com.springbootpart2;

import com.springbootpart2.controller.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
class SpringbootApplication implements CommandLineRunner{

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplication.class, args);
    }

    @Autowired
    UserServiceImpl userServiceImpl;
    @Override
    public void run(String... args){

        try {
            //Prints out added user on a console
            System.out.println(userServiceImpl.addUser("Rotondwa", "Netshimbupfe"));
            //Prints out selected user on a console
            System.out.println(userServiceImpl.getUser(2));
            //Prints out removed user info on a console
            System.out.println(userServiceImpl.removeUser(3));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

