package com.itg.oop.sessiontrials.day2.liskovbadpractice;

public class FileLogger extends Logger{

	@Override
	public void openConnection() {
		new Exception("Not implemented");
	}

	@Override
	public void closeConnection() {
		new Exception("Not implemented");
	}

	@Override
	public void log() {
		System.out.println("database log kaydedildi");
	}
	
}
