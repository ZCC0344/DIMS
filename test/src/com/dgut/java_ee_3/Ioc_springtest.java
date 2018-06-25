package com.dgut.java_ee_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioc_springtest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext  applicationcontext=new ClassPathXmlApplicationContext("com/dgut/java_ee_3/test_spring.xml");
		   service   service=(service) applicationcontext.getBean("service");
		   service.test();
	}

}
