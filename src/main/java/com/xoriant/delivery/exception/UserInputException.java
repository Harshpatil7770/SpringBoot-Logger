package com.xoriant.delivery.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInputException extends RuntimeException {
	/**
	* 
	*/
	/*
	 * custom exception handeler class To catch and provide specific treatment to
	 * existing java exception.
	 */
	private static final long serialVersionUID = 1L;

	private String errorMessage;

	private String errorCode;

}
