package org.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

	
	    public static void main(String[] args) {
	        String str = "Hello World";
	        char[] chars = str.toCharArray();

	        // Create a Map to store character count
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Loop through each character in the array and count its occurrence
	        for (char c : chars) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print the duplicate characters
	        System.out.print("Duplicate characters in the string " + str + ": ");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
	}
