package com.example.demo.exception.customException;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class DefaultError {
	private Object error;
	private Date time;
	private Integer code;
	private HttpStatus type;
	
	public DefaultError(Object error, HttpStatus type) {
		this.error = error;
		this.time = new Date();
		this.code = type.value();
		this.type = type;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object error) {
		this.error = error;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public HttpStatus getType() {
		return type;
	}
	public void setType(HttpStatus type) {
		this.type = type;
	}
}
