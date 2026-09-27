package com.example.pregunta2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Pregunta2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pregunta2Application.class, args);
    }

}
