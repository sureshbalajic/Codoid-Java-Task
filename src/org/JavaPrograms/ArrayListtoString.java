package org.JavaPrograms;
import java.util.ArrayList;


public class ArrayListtoString {

	

	
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<String>();
	        arrayList.add("Hello");
	        arrayList.add("world");
	        arrayList.add("!");

	        StringBuilder sb = new StringBuilder();
	        for (String str : arrayList) {
	            sb.append(str);
	            sb.append(" ");
	        }
	        String result = sb.toString().trim();
	        System.out.println(result);
	    }
	}
