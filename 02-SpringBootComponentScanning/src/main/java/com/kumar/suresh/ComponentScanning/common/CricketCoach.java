/**
 * 
 */
package com.kumar.suresh.ComponentScanning.common;

import org.springframework.stereotype.Component;

/**
 * @author suresh
 *
 */

@Component
public class CricketCoach implements Coach{
	
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Face spin and fast bowling and hit only on left side";
	}

}
