package com.mssvv.onlinetest.controller;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


import org.apache.log4j.Logger;

import com.mssvv.onlinetest.bo.TestBO;
import com.mssvv.onlinetest.constants.ErrorConstants;
import com.mssvv.onlinetest.constants.SuccessConstants;
import com.mssvv.onlinetest.exception.TestBusinessException;
import com.mssvv.onlinetest.exception.TestException;
import com.mssvv.onlinetest.util.PropertyUtil;
import com.mssvv.onlinetest.vo.QuestionVO;

public class TestController extends HttpServlet {
	/**
	 * serialVersionUID value for the serializable class
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The Logger for logging the errors and info
	 */
	public static final Logger LOG = Logger.getLogger("TestController");

	// Logger object used for logging the errors and info
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
			final HttpSession session=request.getSession();
		final QuestionVO question;
		final TestBO logic = new TestBO();// Creates an Object of TestBO
		try {
			
			question=logic.loadQuestion();// load the question
			request.setAttribute("question",question);
			session.setAttribute("questionid","1");
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher(SuccessConstants.TEST_SUCCESS_PG);
			dispatcher.forward(request, response); // forwards the request to
			// implementation.jsp since the user has successfully logged in
			
			

		} catch (TestBusinessException e) {
			LOG.error("Exception occured while logging", e.getCause());
			request.setAttribute("message", e.getMessage());// Sets the message
			// as attribute to the request
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);// forwards the request to
			// error.jsp in case of login failure or any exception
		} catch (TestException e) {// Handles the LoginExceptions and log the
			// errors into the Log
			request 
					.setAttribute("message", PropertyUtil
							.getErrorMessage(ErrorConstants.FATALERROR));
			LOG.error("Exception occured when processing validate user:"
					+ e.getCause());
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}

			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		final HttpSession session=request.getSession();
		final QuestionVO question;
		final TestBO logic = new TestBO();// Creates an Object of TestBO
		try {
			String questionId= (String)session.getAttribute("questionid");
			if(questionId==null){
			doGet(request,response);
			}
			else{
				int questionNo=Integer.parseInt(questionId)+1;
				question=logic.getNextQuestion(questionNo);
				request.setAttribute("question",question);
				session.setAttribute("questionid",questionNo);
				final RequestDispatcher dispatcher = request
					.getRequestDispatcher(SuccessConstants.EXAMCONTENT);
			dispatcher.forward(request, response); // forwards the request to
			// implementation.jsp since the user has successfully logged in
				
			}
			

		} catch (TestBusinessException e) {
			LOG.error("Exception occured while logging", e.getCause());
			request.setAttribute("message", e.getMessage());// Sets the message
			// as attribute to the request
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);// forwards the request to
			// error.jsp in case of login failure or any exception
		} catch (TestException e) {// Handles the LoginExceptions and log the
			// errors into the Log
			request 
					.setAttribute("message", PropertyUtil
							.getErrorMessage(ErrorConstants.FATALERROR));
			LOG.error("Exception occured when processing validate user:"
					+ e.getCause());
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}

	}

}
