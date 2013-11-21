/*
 * @author 346168
 */
package com.mssvv.onlinetest.connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mssvv.onlinetest.util.PropertyUtil;

/**
 * This Class Manages the DataBase Connection Creation.Creates a connection
 * object named connection .
 * 
 */

public class DataManager {

	/** conenction-The DataBase Connection Object */
	private Connection connection;

	/**
	 * This method creates a connection with the database
	 * 
	 * @throws SQLException
	 *             when it is not able to create connection with the given url
	 *             username and password
	 */
	public void createConnection() throws SQLException {
	
		final Driver driver = new com.mysql.jdbc.Driver();// Creates the
																// MySql
		// Driver object
		DriverManager.registerDriver(driver); // Registers the Driver object
		// with DriverManager
		setConnection(DriverManager.getConnection(
				PropertyUtil.getDataBaseUrl(),
				PropertyUtil.getDataBaseUserName(),
				PropertyUtil.getDataBasePassWord()));// Creates the Connection
														// and
		// set it to the connection
		// object of the class named connection

	}

	/**
	 * Setter Method for the connection object
	 * 
	 * @param connection
	 *            The connection object
	 * */

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	/**
	 * Getter method for the connection object
	 * 
	 * @return the connection object
	 * */
	public Connection getConnection() {
		return connection;
	}
}
