package com.example.demo.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exception.customException.DefaultError;
import com.example.demo.exception.customException.OpenAiException;

@ControllerAdvice
public class OpenAiExceptionHandler extends ResponseEntityExceptionHandler{		
	@ExceptionHandler(OpenAiException.class)
	public ResponseEntity<DefaultError> openAiDefaultException(OpenAiException e) {
		return new ResponseEntity<>(new DefaultError(e.getErrorObject(), e.getStatus()), e.getStatus());
	}
}
