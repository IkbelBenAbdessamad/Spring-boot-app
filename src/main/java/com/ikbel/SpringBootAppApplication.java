package com.ikbel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages="com.ikbel.Entity")
public class SpringBootAppApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
}
