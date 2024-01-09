package it.Factory.exemplu3.dependencyinjection.service;

import it.Factory.exemplu3.dependencyinjection.model.User;
import it.Factory.exemplu3.dependencyinjection.repository.OtherUserRepository;
import it.Factory.exemplu3.dependencyinjection.repository.Test;
import it.Factory.exemplu3.dependencyinjection.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private final Test test;

    @Autowired
    public UserService(@Qualifier("userRepository") Test test) {
        this.test = test;
    }

    public List<User> getAllUsers() {
        List<User> users = test.getAllUsers();
        return users;
    }


}
