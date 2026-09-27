package pe.edu.cibertec.t1pregunta3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1Pregunta3Application {

    public static void main(String[] args) {
        SpringApplication.run(T1Pregunta3Application.class, args);
    }

}
