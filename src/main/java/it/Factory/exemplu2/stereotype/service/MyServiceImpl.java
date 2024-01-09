package it.Factory.exemplu2.stereotype.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{

    @Override
    public void doSomething() {
        System.out.println("apelare din MyServiceImpl");
    }
}
