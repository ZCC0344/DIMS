package com.dgut.java_ee_2;

public class Service {
     private  Dao  dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
   
	public Service() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public   void   add()
	{
		 this.dao.save();
	}
}
