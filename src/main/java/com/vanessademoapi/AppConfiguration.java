package com.vanessademoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories("com.vanessademoapi.repo")
@EntityScan("com.vanessademoapi.model")
@SpringBootApplication
@EnableWebMvc
public class AppConfiguration {

    public static void main(String[] args) {

        SpringApplication.run(AppConfiguration.class, args);

        System.out.println("VanessaDemoApi created by Vekktone and realstorml0rd.");
        System.out.println("Copyright 2022 Vekkl0rd LLC. All rights reserved.");
    }

}
