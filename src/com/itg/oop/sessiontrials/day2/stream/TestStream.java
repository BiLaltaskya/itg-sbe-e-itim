package com.itg.oop.sessiontrials.day2.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(25);
		list.add(12);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		list.add(63);
		
		list.stream().forEach(sayi -> System.out.println(sayi));

		System.out.println("--filter-->");
		list.stream().filter(sayi -> sayi>25).forEach(sayi -> System.out.println(sayi));

		System.out.println("--distinct-->");
		list.stream().distinct().forEach(sayi -> System.out.println(sayi));
		
		System.out.println("--sorted-->");
		list.stream().sorted().forEach(sayi -> System.out.println(sayi));

		System.out.println("--reversely sorted-->");
		list.stream().sorted(Comparator.reverseOrder()).forEach(sayi -> System.out.println(sayi));

		System.out.println("--limit-->");
		list.stream().limit(5L).forEach(sayi -> System.out.println(sayi));

		System.out.println("--skip-->");
		list.stream().skip(5L).limit(3).forEach(sayi -> System.out.println(sayi));

		System.out.println("--anymatch--> "+list.stream().anyMatch(sayi -> sayi%2==0));

		System.out.println("--allmatch--> "+list.stream().allMatch(sayi -> sayi<101));
		
		System.out.println("--count--> "+list.stream().filter(sayi -> sayi <65).distinct().count());

		System.out.println("--nonmatch--> "+list.stream().noneMatch(sayi -> sayi<0));

		System.out.println("--map--> ");
		list.stream().map(sayi -> sayi*2).forEach(sayi -> System.out.println(sayi));

	}
}
