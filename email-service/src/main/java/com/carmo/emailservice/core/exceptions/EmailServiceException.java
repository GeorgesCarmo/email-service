package com.carmo.emailservice.core.exceptions;

public class EmailServiceException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8676884781895043297L;

	public EmailServiceException(String message) {
		super(message);
	}
	
	public EmailServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
