package com.inno_Task;


public class Reverse_String {
	
	public static void main(String[] args) {
//	Using StringBuilder	
		String s = "Balamani";
		System.out.println("Original String: "+s);
		StringBuilder reversestring = new StringBuilder(s);
		reversestring.reverse();
		String s2 = reversestring.toString();
		System.out.println("Reverse String: "+s2);
//	for loop
		char[] c = s.toCharArray();
		int length = s.length();
		for (int i=length-1; i >=0; i--) {
		System.out.print(c[i]);	
			
		}
		System.out.println();
	String s1 = "my name is Bala";	
//	String a[]=s1.split("");
	char[] c1 = s1.toCharArray();

	int length1 = s1.length();
	System.out.println(length1);
	for (int i = c1.length-1;i>=0; i--) {
		
	System.out.print(c1[i]);	
	} 
	
	
		
	}

}
