package com.dgut.java_ee_3;
import   javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class service{
	@Resource
	private  Dao  dao;
	
	private String str;

	public  void  test()
	{
		this.dao.save();
	}
   
}
