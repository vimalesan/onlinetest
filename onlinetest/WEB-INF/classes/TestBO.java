/**
 * @author 346168
 */
package com.mssvv.onlinetest.bo;

import org.apache.log4j.Logger;

import com.mssvv.onlinetest.constants.ErrorConstants;
import com.mssvv.onlinetest.dao.TestDao;
import com.mssvv.onlinetest.exception.TestBusinessException;
import com.mssvv.onlinetest.exception.TestException;
import com.mssvv.onlinetest.util.PropertyUtil;
import com.mssvv.onlinetest.vo.QuestionVO;


/**
 * The LoginBO class contains the logic for validating the user's login.
 * 
 * 
 */
public class TestBO {

	/** The log object used for logging the error and info. */
	public static final Logger LOG = Logger.getLogger("TestBO");

	/**
	 * Validate user.
	 * 
	 * @param user
	 *            -The UserVO object which contains the user details
	 * @return true if no exception is thrown
	 * @throws LoginBusinessException
	 *             -Thrown when the login fails
	 * @throws LoginException
	 *             -Thrown in case of any fatal exception occurring in the
	 *             system
	 */
	public QuestionVO loadQuestion()
			throws TestBusinessException, TestException {

		String message = null;// Variable used for storing the messages.
		final TestDao testdao = new TestDao();// UserDao object
		QuestionVO question = null; 
		// UserDao which says whether the username or password
		// is incorrect

		LOG.info("Method Validate User Invoked");
		question = testdao.getFirstQuestion();
		LOG.debug("Authentication flag" + question);

		if (question == null) {
			message = PropertyUtil
					.getErrorMessage(ErrorConstants.QUESTIONNULL);
			LOG.debug("Message" + message);
			throw new TestBusinessException(message);
		}
		LOG.info("Validate User: Response true");
		return question;
	}
	public QuestionVO getNextQuestion(int qno)
			throws TestBusinessException, TestException {

		String message = null;// Variable used for storing the messages.
		final TestDao testdao = new TestDao();// UserDao object
		QuestionVO question = null; 
		// UserDao which says whether the username or password
		// is incorrect

		LOG.info("Method Validate User Invoked");
		question = testdao.getQuestionById(qno);
		LOG.debug("Authentication flag" + question);

		if (question == null) {
			message = PropertyUtil
					.getErrorMessage(ErrorConstants.QUESTIONNULL);
			LOG.debug("Message" + message);
			throw new TestBusinessException(message);
		}
		LOG.info("Validate User: Response true");
		return question;
	}
	
}
