package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class laptop implements device {
		public void use() {
			System.out.print("The laptop device is onprogress");
		}
}
