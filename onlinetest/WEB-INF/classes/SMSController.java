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
import java.net.*;
import java.sql.Timestamp;

public class SMSController extends HttpServlet {
	protected void doPost(final HttpServletRequest request,	final HttpServletResponse response) throws ServletException,IOException {
	try {
		String mobile=request.getParameter("phoneNo");
		String msg=request.getParameter("msg");
		java.util.Date date= new java.util.Date();
		PrintWriter out=response.getWriter();
	    String timeStamp=new Timestamp(date.getTime()).toString();
		
		String url = "http://ubaid.tk/sms/sms.aspx?&codes=1&uid=9003526674&pwd=vimalesan&phone="+mobile+"&msg="+URLEncoder.encode(msg)+"&provider=FullOnSMS";
		//http://ubaid.tk/sms/sms.aspx?&codes=1&uid=vimalesan.a&pwd=anbarasan&phone=9677521018&msg=hello&provider=IndyaRocks
		URL obj = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
		
		conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
		conn.addRequestProperty("User-Agent", "Mozilla");
		int status = conn.getResponseCode();
		if (status == HttpURLConnection.HTTP_OK) {
			out.println("ok");
		}
		else
		{
			out.println("Try again later");
		}
 } catch (Exception e) {
	e.printStackTrace(response.getWriter());
    }		
	}

}
