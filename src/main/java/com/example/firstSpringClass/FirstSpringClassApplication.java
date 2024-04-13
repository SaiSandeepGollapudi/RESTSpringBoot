package com.example.firstSpringClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringClassApplication {
		// FirstSpringApplication.main(args)

		public static void main(String[] args) {

			System.out.println("I am starting now");
			SpringApplication.run(FirstSpringClassApplication.class, args);
		}

	}
