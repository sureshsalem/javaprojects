/**
 * 
 */
package com.kumar.suresh.ComponentScanning.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.suresh.ComponentScanning.common.Coach;

/**
 * @author suresh
 *
 */



@RestController
public class RESTServiceController {
	
	// add dependency in private scope
	
	@Autowired
	Coach mycoach;
	
	public RESTServiceController(Coach coach) {
		mycoach = coach;
	}
	
	@GetMapping("/workout")
	public String getCoachingDetails() {
		return mycoach.getDailyWorkOut();
	}
		
	@GetMapping("/welcome")
	public String geWelcome() {
		return String.format("Hello %s","Suresh");
	}
		

}
