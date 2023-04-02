package org.JavaPrograms;

public class ReplaceString {
	
	    public static void main(String[] args) {
	        String originalString = "The quick brown fox jumps over the lazy dog.";
	        String substringToReplace = "fox";
	        String replacementString = "cat";

	        String newString = originalString.replace(substringToReplace, replacementString);

	        System.out.println("Original string: " + originalString);
	        System.out.println("New string: " + newString);
	    }
	}

