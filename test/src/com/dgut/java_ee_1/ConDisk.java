package com.dgut.java_ee_1;

public class ConDisk implements Disk{
     private String  mate;
     public  void  ConDisk()
     {
    	 
     }
	public void setMate(String mate) {
		this.mate = mate;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("移动硬盘读数据:"+mate);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("移动硬盘写数据："+mate);
	}

}
