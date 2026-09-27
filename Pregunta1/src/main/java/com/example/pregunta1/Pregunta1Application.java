package com.example.pregunta1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Pregunta1Application {

    public static void main(String[] args) {

        SpringApplication.run(Pregunta1Application.class, args);
    }

}
