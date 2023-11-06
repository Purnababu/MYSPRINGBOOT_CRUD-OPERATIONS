package com.example.SpringBoot_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = { "com.example.SpringBoot_Application.controller",
		"com.example.SpringBoot_Application.entity" })

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
