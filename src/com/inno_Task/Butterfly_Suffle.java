package com.inno_Task;

public class Butterfly_Suffle {
	public static void main(String[] args) {
		int a[]= {11,12,13,14,15,16,17,18,19,20};
		int len = a.length/2;
		for (int i = len-1; i >=0; i--) {
			System.out.println(a[i]);
		}
			for (int i = a.length-1; i>=len; i--) {
				System.out.println(a[i]);
				
			}
	}	
}	
		
		
		
		
		
		
	


