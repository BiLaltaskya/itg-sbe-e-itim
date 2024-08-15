package com.itg.oop.sessiontrials.day2.liskovbadpractice;

public class DatabaseLogger extends Logger{

	@Override
	public void openConnection() {
		System.out.println("database logger baglanti acildi");		
	}

	@Override
	public void closeConnection() {
		System.out.println("database logger baglanti kapatildi");		
	}

	@Override
	public void log() {
		System.out.println("database log kaydedildi");		
	}

}
