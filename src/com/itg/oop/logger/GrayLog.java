package com.itg.oop.logger;

public class GrayLog implements ILogger {


	@Override
	public void kaydet(String durum) {
		System.out.println(durum + "GrayLog sunucusuna  kaydedildi");
		
	}

}