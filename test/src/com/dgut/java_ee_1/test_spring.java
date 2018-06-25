package com.dgut.java_ee_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext  applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
           Disk  diks_con=(Disk)  applicationcontext.getBean("ConDisk");
           Disk  diks_usb=(Disk)  applicationcontext.getBean("UsbDisk");
           diks_con.read();
           diks_con.write();
           diks_usb.read();
           diks_usb.write();
	}

}
