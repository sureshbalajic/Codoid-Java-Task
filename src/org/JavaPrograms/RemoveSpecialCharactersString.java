package org.JavaPrograms;

public class RemoveSpecialCharactersString {

	
	    public static void main(String[] args) {
	    	
	        String str = "This string contains $ome @pecial characters!";
	          
	        String cleanedStr = str.replaceAll("[^a-zA-Z0-9 ]", "");
	        
	        System.out.println("Original string: " + str);
	        
	        System.out.println("Cleaned string: " + cleanedStr);
	    }
	}
	

