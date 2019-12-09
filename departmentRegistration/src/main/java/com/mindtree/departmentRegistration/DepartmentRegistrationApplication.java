package com.mindtree.departmentRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mindtree")
public class DepartmentRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentRegistrationApplication.class, args);
	}

}
