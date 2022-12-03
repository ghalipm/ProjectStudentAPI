package com.am.demo3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@RestController
public class Main {

    public static void main(String[] args) {
       run(Main.class, args);
    }

    @GetMapping("/api/v1/hello")  // http://localhost:8080/api/v1/hello
    public String hello() {
        Instant instantCreatedAt= Instant.now();
        return "Hello World! : "+instantCreatedAt;
    }
}

