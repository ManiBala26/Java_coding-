package com.inno_Task;

import java.util.Scanner;

public class Multiplicatiion_Program {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the table value: ");
    int a = s.nextInt();
    System.out.println("End value: ");
    int b = s.nextInt();
    int c;
    for (int i = 1; i < b; i++) {
    	c= a*i;
    	System.out.println(a + "*" +i + "="+ c);
		
	}
   
	

}
}