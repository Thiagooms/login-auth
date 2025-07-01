package com.learn.login_auth_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginAuthApiApplication {

	public static void main(String[] args) {
		EnvLoader.load();
		SpringApplication.run(LoginAuthApiApplication.class, args);
	}

}
