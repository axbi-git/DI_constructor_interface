package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class student {
	device ref;
		void study() {
			System.out.println("The student is studying");
		}
		public void aa() {
			ref.use();
		}
		public student(device ref) {
			super();
			this.ref = ref;
		}
		
}
