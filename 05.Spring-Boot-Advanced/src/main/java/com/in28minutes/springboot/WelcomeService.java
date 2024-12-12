package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Spring to manage this bean and create an instance of this
@Component
public class WelcomeService {

	@Value("${welcome.message}")
	private String welcomeMessage;

	public String retrieveWelcomeMessage() {
		//Complex Method
		return welcomeMessage;
	}
}