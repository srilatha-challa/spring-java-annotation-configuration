package com.spring.ui;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.component.WelcomeComponent;
import com.spring.config.Configuration;

public class UserInterface {
	
	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
		WelcomeComponent welcomeComponent = (WelcomeComponent) context.getBean("welcomeComponent");
		LOGGER.info(welcomeComponent.printWelcome());
		((ConfigurableApplicationContext) context).close();
	}

}
