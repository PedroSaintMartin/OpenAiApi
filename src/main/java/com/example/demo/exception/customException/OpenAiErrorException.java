package com.example.demo.exception.customException;

import org.springframework.http.HttpStatus;

import com.example.demo.dto.openAi.administration.Error;

public class OpenAiErrorException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private Error error;
	private HttpStatus status;
	
	public OpenAiErrorException(Error error, HttpStatus status) {
		this.error = error;
		this.status = status;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
}
