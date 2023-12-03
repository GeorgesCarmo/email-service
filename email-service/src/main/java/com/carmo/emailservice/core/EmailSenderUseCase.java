package com.carmo.emailservice.core;

//Classe que define o comportamento da aplicação(contrato)
public interface EmailSenderUseCase {
	void sendEmail(String to, String subject, String body);
}
