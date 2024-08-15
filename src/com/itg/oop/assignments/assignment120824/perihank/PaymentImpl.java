package com.itg.oop.assignments.assignment120824.perihank;

public class PaymentImpl implements IPayment {

	public IPayment iPayment;
	
	public PaymentImpl(IPayment iPayment){
		this.iPayment = iPayment;
	}
	public PaymentImpl(String loggerTypeName){
		this.iPayment = createInstance(loggerTypeName);
	}	
	
	@Override
	public void pay(double amount) {
		iPayment.pay(amount);
	}
	
	public IPayment createInstance(String className) {
		Class c;
		try {
			c= Class.forName("com.itg.oop.assignments.assignment120824.perihank."+className);
			iPayment=(IPayment)c.newInstance();
		}catch(Exception ee) {
			ee.printStackTrace();
		}
		return iPayment;
	}
}
