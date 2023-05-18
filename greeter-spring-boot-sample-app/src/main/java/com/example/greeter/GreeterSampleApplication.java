package com.example.greeter;

import com.example.greeter.library.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
public class GreeterSampleApplication implements CommandLineRunner {

    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreeterSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.MAY, 19, 11, 5, 15);
        //String message = greeter.greet();
        String message = greeter.greet(localDateTime);
        System.out.println(message);
    }

}
