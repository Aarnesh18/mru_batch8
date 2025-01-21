package com.mru.faqs;

import java.util.Scanner;
public class AddElementsDynamically {
 
	public static void main(String[] args) {
		
		System.out.print("Enter the array length: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("enter array element for "+i+"th position: ");
			arr[i] = scanner.nextInt();
	}
		//display
		for(int element:arr) {
			System.out.print(element+" ");
		}
		scanner.close();
	}
	
	
}
