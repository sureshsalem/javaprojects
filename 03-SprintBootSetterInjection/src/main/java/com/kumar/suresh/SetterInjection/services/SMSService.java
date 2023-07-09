/**
 * 
 */
package com.kumar.suresh.SetterInjection.services;

import org.springframework.stereotype.Component;

/**
 * @author suresh
 *
 */
@Component("smsService")
public class SMSService implements MessageService {

	@Override
	public String sendMessage(String message) {
		// TODO Auto-generated method stub
		//System.out.println("SMSService: "+message);
		return String.format("SMSService %s", message);

	}

}
