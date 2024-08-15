package com.itg.oop.sessiontrials.day2.lambda;

public class TestLambda {

	public static void main(String[] args) {
		MyInterface ref;
		ref = () -> 3.14;
		System.out.println("pi degeri: "+ref.getPiValue());
		
		GenericInterface<String> tersineCevir=(str) ->{
			String sonuc="";
			for(int i=str.length()-1; i>=0; i--) {
				sonuc += str.charAt(i);
			}
			return sonuc;
		};
		System.out.println("Merhaba tersine cevrildi:"+tersineCevir.func("Merhaba"));

		GenericInterface<Integer> faktoriyelHesapla = (n) -> {
			int sonuc=1;
			for(int i=1; i<=n; i++) {
				sonuc = i*sonuc;
			}
			return sonuc;
		};
		System.out.println("7 faktoriyel:"+faktoriyelHesapla.func(7));

	}

}
