package com.jfinal.config;

import com.jfinal.controller.HelloController;
import com.jfinal.controller.IndexController;
import com.jfinal.controller.WebController;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig{
	
//	public static void main(String[] args) {
//        UndertowServer.start(DemoConfig.class, 80, true);
//    }
 
    public void configConstant(Constants me) {
       me.setDevMode(true);
       me.setViewType(ViewType.JSP);
    }
    
    public void configRoute(Routes me) {
       me.add("/hello", HelloController.class);
    }
    
    public void configEngine(Engine me) {
    	me.addSharedObject("context", JFinal.me().getContextPath());
    }
    public void configPlugin(Plugins me) {}
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
	
}
