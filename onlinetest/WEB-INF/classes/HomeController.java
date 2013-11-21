package com.mssvv.onlinetest.controller;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mssvv.onlinetest.bo.TestBO;
import com.mssvv.onlinetest.constants.ErrorConstants;
import com.mssvv.onlinetest.constants.SuccessConstants;
import com.mssvv.onlinetest.exception.TestBusinessException;
import com.mssvv.onlinetest.exception.TestException;
import com.mssvv.onlinetest.util.PropertyUtil;
import com.mssvv.onlinetest.vo.QuestionVO;

public class HomeController extends HttpServlet {
	
	/**
	 * The Logger for logging the errors and info
	 */
	public static final Logger LOG = Logger.getLogger("HomeController");

	// Logger object used for logging the errors and info
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
			doPost(request,response);
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		
		try {
			final RequestDispatcher dispatcher = request
					.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response); // forwards the request to
			// implementation.jsp since the user has successfully logged in

		} catch (Exception e) {
		} 

	}

}
