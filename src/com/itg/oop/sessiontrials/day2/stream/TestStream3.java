package com.itg.oop.sessiontrials.day2.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream3 {

	public static void main(String[] args) {
		Kitap kitap1 = new Kitap("Clean Code","Martin Fowler",800);
		Kitap kitap2 = new Kitap("Java ile Programlama","Baris Altintas",480);
		Kitap kitap3 = new Kitap("Refactoring","Hakan Yilmaz",520);
		List<Kitap> klist =Arrays.asList(kitap1,kitap2,kitap3);
		
		List<Kitap> sayfasayisinagore= klist.stream().sorted(Comparator.comparingInt(Kitap ::getSayfaSayisi))
				.collect(Collectors.toList());
		System.out.println("Sayfasayisina gore:"+sayfasayisinagore);
	}
}
