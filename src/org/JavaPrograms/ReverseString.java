package org.JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String s ="Suresh";
		
		String s1="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char ca = s.charAt(i);
			
			s1 = s1+ca;
			
		}
		System.out.println("Reverse Value:"+s1);
	}
}
