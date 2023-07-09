/**
 * 
 */
package com.kumar.suresh.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
		

}
