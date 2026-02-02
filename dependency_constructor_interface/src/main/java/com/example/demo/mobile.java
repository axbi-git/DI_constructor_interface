package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mobile implements device {
	public void use() {
		System.out.println("The mobile is used because it set as primary");
	}

}
