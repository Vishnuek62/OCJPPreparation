package com.basic;

public class ConcatTest {
	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < 10000; i++) {
			t = t + "Tpoint";
		}
		return t;
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}
//Time taken by Concating with String: 345ms
//	Time taken by Concating with  StringBuffer: 1ms
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		
		
		
		
		
		System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());  
		
        //Hashcode test of String:
        //	3254818
        //	229541438
        //	Hashcode test of StringBuffer:
        //	366712642
        //	366712642
		
		
	
	}
}
