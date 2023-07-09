/**
 * 
 */
package com.kumar.suresh.SetterInjection.services;

import org.springframework.stereotype.Component;

/**
 * @author suresh
 *
 */

@Component
public class EmailService implements MessageService {

	@Override
	public String sendMessage(String message) {
		// TODO Auto-generated method stub
		//System.out.println("EmailService: "+ message);
		return String.format("EmailService %s", message);

	}

}
