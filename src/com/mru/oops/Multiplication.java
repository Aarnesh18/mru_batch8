package com.mru.oops;

public class Multiplication extends Add implements MultiplicationInterface {

	@Override
	public void mul1() {
		int num1 = 200;
		int num2 = 500;
		int res1 = num1 *num2;
		System.out.println(res1);
		
	}

	@Override
	public void mul2(int num1, int num2) {
		int res = num1*num2;
		System.out.print(res);

	}

	@Override
	public int mul3() {
		int num1 = 150;
		int num2 = 450;
		int res = num1 * num2;
		return res;
	}

	@Override
	public int mul4(int num1, int num2) {
		int res = num1*num2;
		return res;
	}

}

