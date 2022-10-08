package com.inno_Task;

public class Maximum_Array {
	public static void main(String[] args) {
		
		int a[]= {23,34,6,8,30};
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
				System.out.println("Minimum value is: "+min);
				
			}
		}
		
		int b[]= {23,34,6,8,30};
		int max =b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i]>max) {
				max=b[i];
				System.out.println("Maximum value is: "+ max);
				
			}
			
		}
		
		
		
		}			
	}

