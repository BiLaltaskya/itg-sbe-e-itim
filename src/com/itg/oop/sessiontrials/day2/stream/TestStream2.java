package com.itg.oop.sessiontrials.day2.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStream2 {
	static List<String> ulkeler= new ArrayList<String>();

	public static void main(String[] args) {
		List<String> yeniulkeler =ulkeleriGetir();
		yeniulkeler.stream().map(p -> p.toUpperCase()).sorted().forEach(ulke -> System.out.println(ulke));
	}
	public static List ulkeleriGetir() {
		ulkeler.add("almanya");
		ulkeler.add("fransa");
		ulkeler.add("ingiltere");
		ulkeler.add("rusya");
		return ulkeler;
	}
}
