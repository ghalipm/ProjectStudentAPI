package com.am.demo3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

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
        LocalDateTime currentTime = LocalDateTime.now(Clock.system(ZoneId.of("US/Eastern")));
        //LocalTime currentTime = LocalTime.now(Clock.system(ZoneId.of("US/Eastern")));
        //return "Hello World! : "+instantCreatedAt;
        return "Hello World! : "+currentTime;
    }

    @GetMapping("/api/v1/person/{id}")  // http://localhost:8080/api/v1/person{100}
    public Person getPerson(Long Id) {
        Person person=new Person(100L, "Amir");
        return person;
    }

    @GetMapping("/api/v1/group")  // http://localhost:8080/api/v1/group
    public List<Person> getGroup() {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person(100L, "Amir"));
        persons.add(new Person(101L, "Tamir"));
        persons.add(new Person(102L, "Pamir"));

        return  persons;
    }

    @GetMapping("/api/v1/personname/{id}")  // http://localhost:8080/api/v1/personname/100
    public String getName(Long id) {
        String name=getPerson(id).name();
        return name;
    }

}

