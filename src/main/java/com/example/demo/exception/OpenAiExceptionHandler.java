package com.example.demo.exception;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.dto.openAi.administration.Error;
import com.example.demo.exception.customException.OpenAiDefaultException;
import com.example.demo.exception.customException.OpenAiErrorException;

@ControllerAdvice
public class OpenAiExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(OpenAiErrorException.class)
	public ResponseEntity<Error> openAiErrorException(OpenAiErrorException e) {
		return new ResponseEntity<>(e.getError(), e.getStatus());
	}
	
	@ExceptionHandler(OpenAiDefaultException.class)
	public ResponseEntity<String> openAiDefaultException(OpenAiDefaultException e) {
		return new ResponseEntity<>(e.getMessage(), e.getStatus());
	}
}
