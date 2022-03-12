package com.example.entity;

import java.util.Arrays;
import java.util.List;

import com.example.entity.entities.Test;
import com.example.entity.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBOperationRunner implements CommandLineRunner {

    @Autowired
    TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {

        testRepository.save(new Test( 1l,"test"));


        System.out.println("----------All Data saved into Database----------------------");
    }

}

