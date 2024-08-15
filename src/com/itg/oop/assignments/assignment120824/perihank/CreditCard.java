package com.itg.oop.assignments.assignment120824.perihank;

public class CreditCard implements IPayment {


	@Override
	public void pay(double amount) {
		System.out.println(amount + " tutarinda Kredi Karti odemesi yapildi");
		
	}

}