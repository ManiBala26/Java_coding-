package com.inno_Task;

public class Ascending_order {

	public static void AscendingNumber() {
		int a[] = { 15, 20, 45, 8, 9, 32 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		System.out.println("Ascending Order:");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		 int maxNumber=a[a.length-1];
		    System.out.println("Max length: "+ maxNumber);
		    int minNumber=a[0];
		    System.out.println("Minimum Number: "+minNumber);
		    int secondmax =a[a.length-2];
		    System.out.println("Second MaxNumber: "+secondmax);
	}
   
	public static void DecendingNumber() {
		int a[] = { 15, 20, 45, 8, 9, 32 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Decending Order: ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);

		}
	}

	public static void main(String[] args) {
		AscendingNumber();
		DecendingNumber();
	}
}
