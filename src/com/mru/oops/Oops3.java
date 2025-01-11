package com.mru.oops;
class Parent111{
	int num1 = 100;
}
class child111 extends Parent111{
	int num2 = 50;
}
class child222 extends Parent111{
	int num2 = 25;
}
public class Oops3 {
	public static void main(String[] args) {
 child111 obj1 = new child111();
 System.out.println(obj1.num1 + obj1.num2);
 
 child222 obj2 = new child222();
 System.out.println(obj2.num1 + obj2.num2);
	}
}
