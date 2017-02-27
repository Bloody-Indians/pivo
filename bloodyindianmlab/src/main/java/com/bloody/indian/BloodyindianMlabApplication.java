package com.bloody.indian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bloody.indian")
public class BloodyindianMlabApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodyindianMlabApplication.class, args);
	}
}
