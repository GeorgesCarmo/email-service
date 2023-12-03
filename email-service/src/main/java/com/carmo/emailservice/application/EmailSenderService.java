package com.carmo.emailservice.application;


import org.springframework.stereotype.Service;

import com.carmo.emailservice.adapters.EmailSenderGateway;
import com.carmo.emailservice.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

	private final EmailSenderGateway emailSenderGateway;
	
	public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSenderGateway.sendEmail(to, subject, body);
	}

}
