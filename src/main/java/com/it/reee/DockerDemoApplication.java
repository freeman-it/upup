package com.it.reee;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DockerDemoApplication.class);
        app.setBanner((environment, sourceClass, out) -> out.println("-------------hello  docker-----------------"));
        app.run();
    }

}
