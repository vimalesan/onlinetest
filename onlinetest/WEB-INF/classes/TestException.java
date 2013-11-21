/*
 * @author 346168
 */
package com.mssvv.onlinetest.exception;

/**
 * Exception class for all the exception other than the business rule violation
 * exception including SQL exception,IOEXception etc.
 */
public class TestException extends Exception {

	
	/**
	 * Overloaded Constructor.
	 * 
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public TestException(final Throwable exception) {
		super(exception);// Call to the parent class constructor

	}

	/**
	 * Overloaded Constructor.
	 * 
	 * @param message
	 *            -The message to be displayed for the particular exception
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public TestException(final String message, final Throwable exception) {
		super(message, exception);// Call to the parent class constructor

	}

}
