package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyConstructorInterfaceApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(DependencyConstructorInterfaceApplication.class, args);
		student st = ac.getBean(student.class);
		st.study();
		st.aa();
		
	}

}
