package com.itg.oop.sessiontrials.day2.liskovbadpractice;

public class LogTest {

	public static void main(String[] args) {
		DatabaseLogger db=new DatabaseLogger();
		db.openConnection();
		db.closeConnection();
		db.log();
		
		FileLogger file=new FileLogger();
		//Functions that are not need unnecessarily accessible
		file.openConnection();
		file.closeConnection();
		file.log();
	}

}
