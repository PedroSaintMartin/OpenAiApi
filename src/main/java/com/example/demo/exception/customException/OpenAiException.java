package com.example.demo.exception.customException;

import org.springframework.http.HttpStatus;

public class OpenAiException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private Object errorObject;
	private HttpStatus status;
	
	public OpenAiException(Object errorObject, HttpStatus status) {
		this.errorObject = errorObject;
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public Object getErrorObject() {
		return errorObject;
	}
	public void setErrorObject(Object errorObject) {
		this.errorObject = errorObject;
	}
}