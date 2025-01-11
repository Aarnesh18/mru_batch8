package com.mru.oops;

import java.util.ArrayList;

public class Java8features {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(45);
		list1.add(55);
		
 //list1.forEach(num -> System.out.println(num));
		
		//print even numbers
		list1.stream().filter(num->num%2==0).forEach(System.out::println);
		
		//print only odd numbers
		list1.stream().filter(num->num%2!=0).forEach(System.out::println);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(22);
		list2.add(32);
		list2.add(4);
		list2.add(5);
		
		list2.stream().map(num -> num*10).forEach(System.out::println);
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("Hello");
		list3.add("welcome");
		list3.add("dsa");
		
		list3.stream().map((name)->{
			return new StringBuilder(name).reverse().toString();
		}).forEach(System.out::println);
		
	}

}
