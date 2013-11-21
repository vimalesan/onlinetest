/**
 * @author 346168
 */
package com.mssvv.onlinetest.constants;

/**
 * Contains the constants to be used for the login application
 * 
 * 
 */
public final class ErrorConstants {

	private ErrorConstants(){
		new ErrorConstants();
	}
	/**
	 * The error message property file
	 */
	public static final String ERRORMESSAGES = "errormessages";
	public static final String QUESTIONNULL = "No question exist";
	
	
	/**
	 * The error page which is to be shown on fatal errors
	 */
	public static final String ERRORPAGE = "Error.jsp";
	/**
	 * The error code for fatal error
	 */
	public static final String FATALERROR = "500";
	
	/**
	 * Error message key for query failure
	 */	
	public static final String QUERY_FAILURE = "599";
	/**
	 * Error message key for failure in closing the connection
	 */
	public static final String CONNECTION_CLOSE = "598";
	/**
	 * Error message key if database driver not found
	 */
	public static final String NO_DRIVER = "597";

	
	
	
}

