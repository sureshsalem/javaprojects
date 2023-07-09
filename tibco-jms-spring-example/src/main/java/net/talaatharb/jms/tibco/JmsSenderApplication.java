package net.talaatharb.jms.tibco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//curl -X POST -i http://localhost:8080/api/message --data 'Test message from suresh'

@SpringBootApplication
public class JmsSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsSenderApplication.class, args);
	}
}
