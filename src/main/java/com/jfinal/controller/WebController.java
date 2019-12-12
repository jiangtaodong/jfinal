package com.jfinal.controller;

import com.jfinal.core.Controller;
import com.jfinal.service.StudentService;

/**
 * JFinal controller控制层，Student控制层。
 * @author MSI-PC
 *
 */
public class WebController extends Controller{
	
	private StudentService studentService = new StudentService();
	
	public void index() {
		
		renderText("Hello JFinal....");
		
	}
	
	public void test(){
	   System.out.println("进入...");
	   studentService.add("测试值");
	   System.out.println("执行成功...");
	}
	
}
