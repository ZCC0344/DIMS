package com.dgut.java_ee_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dgut.java_ee_1.Disk;

public class Ioc_springtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext  applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
         Service  service=(Service)  applicationcontext.getBean("service");
         service.add();
	}

}
