package com.assessment.EmployeeApp.exception;

public class EmployeeAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6191550727495017492L;

	public EmployeeAlreadyExistsException(String msg) {
		super(msg);
	}

}
