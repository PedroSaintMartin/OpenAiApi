package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.customException.OpenAiDefaultException;

@ControllerAdvice("com.example.demo.service.openAi")
public class OpenAiExceptionHandler {
	@ExceptionHandler(OpenAiDefaultException.class)
	public ResponseEntity<OpenAiDefaultException> openAiDefaultException(OpenAiDefaultException e) {
		return new ResponseEntity<>(e, e.getStatus());
	}
}
