package com.itheima.ioc;
import  org.springframework.context.ApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
         UserDao  userdao=(UserDao)  applicationContext.getBean("UserDao");
         UserDao  userdao1=(UserDao)  applicationContext.getBean("UserDao1");
	     System.out.println(userdao);
	     userdao1.say();
	}

}
