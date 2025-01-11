package com.mru.oops;
class Parent1{
	int x = 200;
}

class child1 extends Parent1{
	int y = 100;
}
public class Oops1 {

	public static void main(String[] args) {
	
	child1 obj = new child1();
	int num1 = obj.x;
	int num2 = obj.y;
	
	System.out.println(num1);
	System.out.println(num2);
	}

}
