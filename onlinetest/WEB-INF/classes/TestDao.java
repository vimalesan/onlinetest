package com.mssvv.onlinetest.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mssvv.onlinetest.connection.DataManager;
import com.mssvv.onlinetest.constants.DataBaseConstants;
import com.mssvv.onlinetest.exception.TestException;
import com.mssvv.onlinetest.vo.QuestionVO;


public class TestDao {

	public QuestionVO getFirstQuestion() throws TestException {
		QuestionVO question=null;
		// The SQL query string for retrieving the user's data from the database
		final String queryString = DataBaseConstants.QRY_FIRST_QUESTION; 
		ResultSet result = null;
		DataManager manager = null;// DataManager object needed
		// for database connection
		try {
			manager = new DataManager();
			manager.createConnection();
			final PreparedStatement statement = manager.getConnection()
					.prepareStatement(queryString); // Creates the
			// preparedStatement Object
			result = statement.executeQuery(); // Executes the Query
			if (result.next()) { 
				 question=new QuestionVO();
				 question.setId(result.getInt(1));
				 question.setQuestion(result.getString(2));
				 question.setOption1(result.getString(3));
				 question.setOption2(result.getString(4));
				 question.setOption3(result.getString(5));
				 question.setOption4(result.getString(6));
			}
		} catch (SQLException e) {
			throw new TestException("SQL Exception happened", e);
		} finally {

			try {
				if (result != null) {
					result.close();
				}
				if(manager.getConnection()!=null)
				{
				manager.getConnection().close();
				}
			} catch (SQLException e) {
				throw new TestException("SQL Exception happened", e);
			}

		}
		return question;
	}
	public QuestionVO getQuestionById(int qno) throws TestException {
		QuestionVO question=null;
		// The SQL query string for retrieving the user's data from the database
		final String queryString = DataBaseConstants.QRY_QUESTION_BY_ID; 
		ResultSet result = null;
		DataManager manager = null;// DataManager object needed
		// for database connection
		try {
			manager = new DataManager();
			manager.createConnection();
			final PreparedStatement statement = manager.getConnection()
					.prepareStatement(queryString); // Creates the
			// preparedStatement Object
			statement.setInt(1,qno);
			result = statement.executeQuery(); // Executes the Query
			if (result.next()) { 
				 question=new QuestionVO();
				 question.setId(result.getInt(1));
				 question.setQuestion(result.getString(2));
				 question.setOption1(result.getString(3));
				 question.setOption2(result.getString(4));
				 question.setOption3(result.getString(5));
				 question.setOption4(result.getString(6));
			}
		} catch (SQLException e) {
			throw new TestException("SQL Exception happened", e);
		} finally {

			try {
				if (result != null) {
					result.close();
				}
				if(manager.getConnection()!=null)
				{
				manager.getConnection().close();
				}
			} catch (SQLException e) {
				throw new TestException("SQL Exception happened", e);
			}

		}
		return question;
	}
	

}
