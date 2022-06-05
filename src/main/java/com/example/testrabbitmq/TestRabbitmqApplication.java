package com.example.testrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


//@EnableAutoConfiguration
//@ComponentScan ("com.example.testrabbitmq")
//@Import(RabbitConfiguration.class)


@SpringBootApplication
public class TestRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRabbitmqApplication.class, args);
    }

}
