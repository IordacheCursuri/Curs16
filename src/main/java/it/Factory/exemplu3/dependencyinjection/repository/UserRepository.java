package it.Factory.exemplu3.dependencyinjection.repository;

import it.Factory.exemplu3.dependencyinjection.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository implements Test{

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Gigel", "23"));
        users.add(new User("Ana", "30"));
        users.add(new User("Viorel", "55"));
        return users;
    }




}
