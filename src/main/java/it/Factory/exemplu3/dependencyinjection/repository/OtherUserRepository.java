package it.Factory.exemplu3.dependencyinjection.repository;

import it.Factory.exemplu3.dependencyinjection.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OtherUserRepository implements Test{
    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
