/**
 * @author 346168
 */
package com.mssvv.onlinetest.constants;

/**
 * This class contains the constant declarations related to database
 * 
 */
public final class DataBaseConstants {
	private DataBaseConstants() {
		new DataBaseConstants();
	}

	/**
	 * The Database properties file
	 */
	public static final String DBPROPERTIES = "dataBase";
	/**
	 * Data base user name
	 */
	public static final String DATABASEUSERNAME = "database.username";
	/**
	 * Data base password
	 */
	public static final String DATABASEPASSWORD = "database.password";
	/**
	 * The type of data base the application uses
	 */
	public static final String DATABASETYPE = "database.databaseType";
	/**
	 * The driver of database the application uses
	 */
	public static final String DBDRIVER = "database.driver";
	/**
	 * The SQL query for getting the user details for user validation
	 */
	public static final String QRY_FIRST_QUESTION = "select * from question limit 1";
	
	public static final String QRY_QUESTION_BY_ID = "select * from question where id=?";
}
