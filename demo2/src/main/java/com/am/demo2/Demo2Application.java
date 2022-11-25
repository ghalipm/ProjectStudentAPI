package com.am.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    //@GetMapping("/hello")  // http://localhost:8080/hello
    @GetMapping  // http://localhost:8080
    public String hello() {
        return "Hello World!";
    }

}
