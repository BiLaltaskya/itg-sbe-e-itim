package com.itg.oop.assignments.assignment120824.perihank;

public class GooglePay implements IPayment {


	@Override
	public void pay(double amount) {
		System.out.println(amount + " tutarinda GooglePay odemesi yapildi");
		
	}

}