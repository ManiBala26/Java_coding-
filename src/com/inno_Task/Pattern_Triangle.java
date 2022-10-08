package com.inno_Task;

import java.util.Iterator;

public class Pattern_Triangle {
	public static void main(String[] args) {
		Oddnum();
		EvenNum();
	System.out.println( );	
	int r =5;
	for (int i = r; i >=1; i--) {
		for (int j = 1; j <i*2; j++) {
		System.out.print(" ");	
		}for (int t2 = i; t2 <=r; t2++) {
			System.out.print(t2 +" ");
			
		}for (int t3 = r-1; t3 >=i; t3--) {
			System.out.print(t3 +" ");
			
		}
		System.out.println(" ");
	}

	}
	public static void Oddnum() {
		int num=1;
	for (int i = 1; i <=5; i+=2) {
		for (int j = 0; j <=i; j++) {
			System.out.print(num +" ");
	
		}
		System.out.println( );
		num+=2;
	}

	}
	public static void EvenNum() {
		System.out.println();
		int num=2;
		for (int i = 2; i <=6; i+=2) {
			for (int j = 1; j <=i; j++) {
				System.out.print(num + " ");
				
			}
			System.out.println();
			num+=2;
		}

	}
	
	

}