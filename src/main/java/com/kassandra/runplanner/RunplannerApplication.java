package com.kassandra.runplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.kassandra.runplanner.model")
public class RunplannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunplannerApplication.class, args);
	}

}
