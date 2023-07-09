package com.kumar.suresh.SetterInjection.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kumar.suresh.SetterInjection.services.MessageService;

@RestController
public class RESTController {

	private MessageService messageService;
	private MessageService smsService;

	/**
	 * @param messageService the messageService to set
	 */
	@Autowired
	public void setMessageService(@Qualifier("emailService") MessageService messageService) {
		this.messageService = messageService;
	}
	
	

	/**
	 * @param smsService the smsService to set
	 */
	@Autowired
	public void setSmsService(MessageService smsService) {
		this.smsService = smsService;
	}



	@GetMapping("/emailservice")
	public String sendEmailMessage(String message) {
		return messageService.sendMessage("Suresh");
	}
	
	@GetMapping("/smsservice")
	public String sendSMSMessage(String message) {
		return smsService.sendMessage("Suresh2");
	}
	
	
	

}
