package com.itg.oop.sessiontrials.day2.stream;

import java.util.ArrayList;
import java.util.List;
/**Evrim O.*/
public class TestStreamPerformance {
	

	 public static void main(String[] argv) throws Exception {

			List<Integer> list = new ArrayList<Integer>();

			List<Integer> list2 = new ArrayList<Integer>();
			
			long t1 = System.currentTimeMillis();

			System.out.println("Start: " + t1);
			
			for(int i=0; i<10000000;i++) {
				list.add(i);
			}

			long t2 = System.currentTimeMillis();
			
			System.out.println("List generated: " + (t2 - t1));
			
			list2.addAll(list);
			
			long t3 = System.currentTimeMillis();

			System.out.println("List2 generated: " + (t3 - t2));
			
			list.stream();

			long t4 = System.currentTimeMillis();

			System.out.println("Stream generated: " + (t4 - t3));

			list.stream().filter(num -> num < 1000000).count();
			

			long t5 = System.currentTimeMillis();

			System.out.println("Stream generate&filter: " + (t5 - t4));
	 }
	
	

}
