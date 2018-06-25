package com.itheima.instance.static_factory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Bean2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext  applicationcontext=new ClassPathXmlApplicationContext("com/itheima/instance/static_factory/Beans2.xml");
    System.out.println(applicationcontext.getBean("bean2"));
	}

}
