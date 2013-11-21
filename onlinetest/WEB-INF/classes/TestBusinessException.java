/*
 * @author 346168
 */
package com.mssvv.onlinetest.exception;

/**
 * TestException.The exception which is thrown during the user Test validation
 * process
 * 
 */
public class TestBusinessException extends Exception {

	/**
	 * OverLoaded Constructor.
	 * 
	 * @param message
	 *            -The message to be used for the particular exception
	 */
	public TestBusinessException(final String message) {
		super(message);// Calling to the super class constructor

	}

	/**
	 * OverLoaded Constructor.
	 * 
	 * @param message
	 *            -The message to be used for the particular exception
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public TestBusinessException(final String message,
			final Throwable exception) {
		super(message, exception);// Calling to the super class constructor

	}

	/**
	 * OverLoaded Constructor.
	 * 
	 * @param exception
	 *            -The exception object which got caught.
	 */
	public TestBusinessException(final Throwable exception) {
		super(exception);// Calling to the super class constructor
	}

}
