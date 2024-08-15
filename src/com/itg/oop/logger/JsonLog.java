package com.itg.oop.logger;

public class JsonLog implements ILogger {
	@Override
	public void kaydet(String durum) {
		System.out.println(durum + " JSON ye  kaydedildi");
	}
}
