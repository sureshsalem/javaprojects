package com.kumar.suresh.SetterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.kumar.suresh.SetterInjection",
				"com.kumar.suresh.SetterInjection.services",
				"com.kumar.suresh.SetterInjection.rest"}
		)
public class SetterInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetterInjectionApplication.class, args);
	}

}
