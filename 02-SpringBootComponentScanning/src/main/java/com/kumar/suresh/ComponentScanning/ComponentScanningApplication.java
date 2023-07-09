package com.kumar.suresh.ComponentScanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
scanBasePackages={
	"com.kumar.suresh.ComponentScanning",
	"com.kumar.suresh.ComponentScanning.rest",
	"com.kumar.suresh.ComponentScanning.common"
}) 
public class ComponentScanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentScanningApplication.class, args);
	}

}
