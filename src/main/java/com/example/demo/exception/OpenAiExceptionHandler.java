package com.example.demo.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.customException.OpenAiException;

@ControllerAdvice
public class OpenAiExceptionHandler extends ResponseEntityExceptionHandler{		
	@ExceptionHandler(OpenAiException.class)
	public ResponseEntity<Object> openAiDefaultException(OpenAiException e) {
		return new ResponseEntity<>(e.getErrorObject(), e.getStatus());
	}
}
