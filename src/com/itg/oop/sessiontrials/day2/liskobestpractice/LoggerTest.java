package com.itg.oop.sessiontrials.day2.liskobestpractice;

public class LoggerTest {

	public static void main(String[] args) {
		DatabaseLogger db= new DatabaseLogger();
		db.log();
		
		Logger file= new FileLogger();
		file.log();
	}

}
