package com.inno_Task;

public class string_Covertion {
	
	public static void main(String[] args) {
		
		String s1 = "12345";
		int value = Integer.parseInt(s1);
		System.out.println("Integer value:"+value);
		
		int a =456;
		String Value2 = String.valueOf(a);
        System.out.println("String Value: "+Value2);		
		
		
        String s3 = "23.1";
        double Value3 = Double.parseDouble(s3);
        System.out.println("Double value: "+Value3);
        
        double d = 67.32;
        String value4 = String.valueOf(d);
        System.out.println("String value: "+value4);
        
		
	}
	
	
	
	

}
