package com.mru.oops;

public class Oops4 {
	
	
	public void addition(int num1, int num2) {
		int res1 = num1 + num2;
		System.out.println(res1);
	}
	
	public void addition(int num1, int num2, int num3) {
		int res2 = num1+num2+num3;
		System.out.println(res2);
	}

	public static void main(String[] args) {
		Oops4 obj = new Oops4();
		obj.addition(10, 5);
		obj.addition(10,5, 3);
}
}