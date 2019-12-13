package com.mindtree.cafechain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com.mindtree")
public class CcafechainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcafechainApplication.class, args);
	}

}
