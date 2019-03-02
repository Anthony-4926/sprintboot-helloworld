package com.example.sprintboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintbootHelloworldApplication {

    public static void main(String[] args) {
        System.out.println("电脑内存不够用了");
        SpringApplication.run(SprintbootHelloworldApplication.class, args);
    }

}
