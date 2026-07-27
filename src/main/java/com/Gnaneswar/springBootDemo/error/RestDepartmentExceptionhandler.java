package com.Gnaneswar.springBootDemo.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestDepartmentExceptionhandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(exception = DepartmentNotFoundException.class) 
	public ResponseEntity<ErrorResponse> departmentNotFoundException(DepartmentNotFoundException exception, WebRequest request){
		ErrorResponse message=new ErrorResponse(HttpStatus.NOT_FOUND,exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
	@ExceptionHandler(exception = DepartmentNameNotFound.class)
	public ResponseEntity<ErrorResponse> DeptNameNotFound(DepartmentNameNotFound exception){
		ErrorResponse message=new ErrorResponse(HttpStatus.NOT_FOUND,exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
	}
}
