package com.maycolsr.ApiAlquilarte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class ApiAlquilarteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAlquilarteApplication.class, args);
	}

}
