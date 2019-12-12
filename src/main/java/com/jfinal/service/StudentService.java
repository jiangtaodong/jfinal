package com.jfinal.service;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

/**
 * JFinal业务层 service（jfinal支持事务处理，这里只是简单的插入一条数据）。
 * @author MSI-PC
 *
 */
public class StudentService {
	
	public void add(String newstitle){
        Record student = new Record().set("name", "小明");
        Db.save("student", student);
	}

}
