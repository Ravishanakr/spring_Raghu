package com.example.demo.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.bean.MyErrorResponse;
import com.example.demo.exception.ProductNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	/*
	 * @ExceptionHandler(ProductNotFoundException.class) public ResponseEntity<?>
	 * showCustomErrorMsg(ProductNotFoundException pnfe) {
	 * 
	 * return new ResponseEntity<String>(pnfe.getMessage(),
	 * HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * }
	 */

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustomErrorMsg2(ProductNotFoundException pnfe) {
		return new ResponseEntity<MyErrorResponse>(
				new MyErrorResponse(new Date().toString(), "EXCEPTION IN PROCESS", 500, pnfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
