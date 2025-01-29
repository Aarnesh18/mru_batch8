package com.mru.faqs;

import java.util.HashSet;

public class CheckDuplicates1 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,1,2,3};
		HashSet<Integer> set=new HashSet<>();
		for(int element:arr) {
			if(set.contains(element)) {
				System.out.println("Duplicates are found");
				break;
			}
		
		else {
			set.add(element);
		}
	}
		

}
}
