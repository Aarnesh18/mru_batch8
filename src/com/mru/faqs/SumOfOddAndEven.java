package com.mru.faqs;

public class SumOfOddAndEven {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        int sumEven = 0;
	        int sumOdd = 0;

	        for (int num : array) {
	            if (num % 2 == 0) {
	                sumEven += num;
	            } else {
	                sumOdd += num;
	            }
	        }

	        System.out.println("Sum of even numbers: " + sumEven);
	        System.out.println("Sum of odd numbers: " + sumOdd);
	    }
	}



