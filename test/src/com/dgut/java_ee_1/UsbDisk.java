package com.dgut.java_ee_1;

public class UsbDisk implements Disk{
	private  String  str;
	public  void  UsbDisk()
	{
		
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("U�̶�����:"+str);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("U��д���ݣ�"+str);
	}

}
