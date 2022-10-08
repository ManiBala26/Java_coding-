package com.inno_Task;

public class Amstrong_Print {
    public static void main(String[] args) {
		int c=0;
		for (int i = 1; i < 1000; i++) {
			int a,k,j=0;
			 a=i;
			while (a>0) {
				k=a%10;
				j=j+(k*k*k);
				a=a/10;
			}
			if (i==j) {
				System.out.println("Amstrong number is: "+j);
				c++;
				
				
			}
			
		}
    	
		System.out.println("Amstrong Number count is = "+c);	
    	
    	
    
	} 
	
	
	
	
	
	
}
