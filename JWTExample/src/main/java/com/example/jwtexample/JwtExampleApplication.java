package com.example.jwtexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

@SpringBootApplication
public class JwtExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(JwtExampleApplication.class, args);
    }
}
