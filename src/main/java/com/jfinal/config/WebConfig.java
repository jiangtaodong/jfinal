package com.jfinal.config;

import com.jfinal.controller.IndexController;
import com.jfinal.controller.WebController;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.pojo.Student;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;

/**
 * JFinal配置文件，直接extends JFinalConfig重写JFinalConfig方法。
 * @author MSI-PC
 *
 */
public class WebConfig extends JFinalConfig{
	
	@Override
	public void configConstant(Constants constants) {
		//设置编码格式
		constants.setEncoding("UTF-8");
		//设置为开发模式（如果为false，jfinal会缓存页面，导致开发时修改页面后不能立即呈现）
		constants.setDevMode(true);
		//jfinal支持很多类型的页面，这里设置为jsp，FreeMarker也支持）
		constants.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes routes) {
		//统一设置映射访问路径  类似于spring mvc的@RequestMapping
		routes.add("/", IndexController.class);
		routes.add("/student", WebController.class);
	}

	@Override
	public void configPlugin(Plugins plugins) {
		//这里启用Jfinal插件  读取jdbc配置
		PropKit.use("jdbc.properties");
		final String URL =PropKit.get("jdbcUrl");
		final String USERNAME = PropKit.get("user");
		final String PASSWORD =PropKit.get("password");
		final Integer INITIALSIZE = PropKit.getInt("initialSize");
		final Integer MIDIDLE = PropKit.getInt("minIdle");
		final Integer MAXACTIVEE = PropKit.getInt("maxActivee");
		 
		DruidPlugin druidPlugin = new DruidPlugin(URL,USERNAME,PASSWORD);
		druidPlugin.set(INITIALSIZE,MIDIDLE,MAXACTIVEE);
		druidPlugin.setFilters("stat,wall");
		plugins.add(druidPlugin);
		 
		//实体映射
		ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
		activeRecordPlugin.addMapping("students","id", Student.class);
		plugins.add(activeRecordPlugin);
		
	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
		
	}

}
