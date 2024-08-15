package com.itg.oop.logger;

public class LoggerImpl implements ILogger {

	public ILogger iLogger;
	
	public LoggerImpl(ILogger iLogger){
		this.iLogger = iLogger;
	}
	public LoggerImpl(String loggerTypeName){
		this.iLogger = createInstance(loggerTypeName);
	}	
	
	@Override
	public void kaydet(String durum) {
		iLogger.kaydet(durum);
	}
	
	public ILogger createInstance(String className) {
		Class c;
		try {
			c= Class.forName("com.itg.oop.logger."+className);
			iLogger=(ILogger)c.newInstance();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return iLogger;
	}
}
