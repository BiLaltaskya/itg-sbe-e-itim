package com.itg.oop.logger;

public class Logger {
	public String type;
	public  void kaydet(String msg) {
		System.out.println(getType()+" msg:"+ msg);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
