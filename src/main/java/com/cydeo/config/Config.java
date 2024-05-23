package com.cydeo.config;


import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.cydeo")
public class Config {

    @Bean
    public Faker fakerBean(){
            return new Faker();
    }
}
