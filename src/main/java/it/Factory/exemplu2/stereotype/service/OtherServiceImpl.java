package it.Factory.exemplu2.stereotype.service;

import org.springframework.stereotype.Service;

@Service
public class OtherServiceImpl implements MyService{

    @Override
    public void doSomething() {
        System.out.println("apalare din OtherServiceImpl");
    }
}
