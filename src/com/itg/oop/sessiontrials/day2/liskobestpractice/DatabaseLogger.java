package com.itg.oop.sessiontrials.day2.liskobestpractice;

public class DatabaseLogger extends ConnecttableLogger{

	@Override
	public void openConnection() {
		System.out.println("database logger open");		
	}

	@Override
	public void closeConnection() {
		System.out.println("database logger close");		
		
	}

	@Override
	public void log() {
		openConnection();
		closeConnection();
	}
	
}
