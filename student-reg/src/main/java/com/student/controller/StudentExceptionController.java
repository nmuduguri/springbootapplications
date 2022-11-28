package com.student.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionController {
	
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> handleInvalidArgument(MethodArgumentNotValidException ex){
		
		Map<String,String> errorMap = new HashMap<>();
		
		
		BindingResult br = ex.getBindingResult();
		
		List<FieldError> errorList = br.getFieldErrors();

		
		for(FieldError fe : errorList) {
			
			errorMap.put(fe.getField(), fe.getDefaultMessage());
		}
		
		
		

		return errorMap;
	}

}
