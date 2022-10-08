package com.inno_Task;

import java.util.Scanner;

public class Amstrong_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  number: ");
	    int x=s.nextInt();
	    int a=x;
	    int i,j=0;
	    while (a>0) {
	    	i=a%10;
	    	j=j+(i*i*i);
	    	a=a/10;
	    	
	    }	
	 if(j==x) {
		 System.err.println("Amstrong Number");
		
	}else {
		System.out.println("Not Amstrong Number");
	}		   
	
	}
}
	    
	    
		
		
		
		
		
		
		
		
		
		