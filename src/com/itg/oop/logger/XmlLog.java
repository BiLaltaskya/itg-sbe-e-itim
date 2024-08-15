package com.itg.oop.logger;
public class XmlLog implements ILogger{
	
	
	@Override
	public void kaydet(String durum) {
		System.out.println(durum + " xml  e  kaydedildi");
		
	}

}