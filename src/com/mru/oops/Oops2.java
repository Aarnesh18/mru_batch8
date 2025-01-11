package com.mru.oops;
class Parent11{
	public void m1() {
		System.out.println("Parent");
	}
}
class child11 extends Parent11{
	public void m2() {
		System.out.println("Child");
	}
}
	class Subchild extends child11{
		public void m3() {
			System.out.println("subchild");
		}
	}



public class Oops2 {
	
	public static void main(String[] args) {
		Subchild obj = new Subchild();
   obj.m1();
   obj.m2();
   obj.m3();
}
}