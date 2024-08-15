package com.itg.oop.logger;

public class DbLog implements ILogger {


	@Override
	public void kaydet(String durum) {
		System.out.println(durum + " DB ye  kaydedildi");
		
	}

}