package com.spring.component;

import org.springframework.stereotype.Component;

@Component
public class WelcomeComponent {
	
	public String printWelcome() {
		return "Welcome to Spring Annotation Configuration";
	}

}
