package com.mru.oops;

class Parent12{
	public void dbConn() {
		System.out.println("data from oracle soon ......");
	}
}

class child12 extends Parent12{
	public void dbConn() {
		System.out.println("data from mongodb soon......!");
	}
}

public class Oops5 {
	
	public static void main(String[] args) {
		child12 obj = new child12();
		obj.dbConn();
	}

}
