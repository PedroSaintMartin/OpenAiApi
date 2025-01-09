package com.example.demo.exception.customException;

import org.springframework.http.HttpStatus;

public class OpenAiDefaultException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	
	public OpenAiDefaultException(String msg, HttpStatus status) {
		super(msg);
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}