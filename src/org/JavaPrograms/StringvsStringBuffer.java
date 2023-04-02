package org.JavaPrograms;

public class StringvsStringBuffer {
	
	    public static void main(String[] args) {
	        String str = "Hello";
	        StringBuffer sb = new StringBuffer("Hello");

	        // Changing the value of str
	        str = str + " World";
	        System.out.println("String: " + str);

	        // Changing the value of sb
	        sb.append(" World");
	        System.out.println("StringBuffer: " + sb.toString());
	    }
	}
