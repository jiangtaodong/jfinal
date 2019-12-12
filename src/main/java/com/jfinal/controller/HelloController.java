package com.jfinal.controller;

import com.jfinal.core.Controller;

public class HelloController extends Controller{

	public void index() {
		   renderText("Hello JFinal World.");
	    }
	
	
	  public void test() {
		  
		  render("/WEB-INF/index.jsp");
		  
		 }
	 
	public void testjsp(String user,String password) {
		System.out.println("username【" + user + "】" + "password【" + password + "】");
	       render("/WEB-INF/test.jsp");
	    }
	
}
