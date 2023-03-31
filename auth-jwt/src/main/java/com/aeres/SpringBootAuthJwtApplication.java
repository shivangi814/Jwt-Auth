package com.aeres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAuthJwtApplication {
	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringBootAuthJwtApplication.class, args);	    
		} catch (Exception e) {
	        e.printStackTrace(); 
	    }
			
	}

}
