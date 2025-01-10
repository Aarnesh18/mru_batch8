package com.mru.oops;
/*	public void addition();
	
	public int subtraction(int num1, int num2);
	
	public void multi(int num1, int num2);
	
	public int div();
}
 
class Test1 implements Interface{

	@Override
	public void addition() {
		int num1 = 100;
		int num2 = 50;
		int result = num1+num2;
		System.out.println("Addition: " + result);
		
	}

	@Override
	public int subtraction(int num1, int num2) {
		int res1 = num1 - num2;
		return res1;
		
	}

	@Override
	public void multi(int num1, int num2) {
		int res2 = num1*num2;
		System.out.println("multiplication: "+ res2);
		
	}

	@Override
	public int div() {
		int num1=100;
		int num2=50;
		int res3 = num1/num2;
		return res3;
	}
	
}*/
public class Demo1 {

	public static void main(String[] args) {
		Test1 ob = new Test1();
		ob.addition();
		int res1= ob.subtraction(100, 50);
		System.out.println("subtraction: "+res1);
		ob.multi(100,50);
		int res2 = ob.div();
		System.out.println("Division: "+res2);

	}

}
