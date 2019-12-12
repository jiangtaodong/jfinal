package com.jfinal.controller;

import com.jfinal.core.Controller;

/**
 *JFinal IndexController 项目根路径访问
 * @author MSI-PC
 *
 */
public class IndexController extends Controller{
	
	public void test(){
        render("index.jsp");
    }

}
