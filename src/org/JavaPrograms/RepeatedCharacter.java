package org.JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {

	
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

	        // Find the maximum repeated character count
	        int maxCount = 0;
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            int count = entry.getValue();
	            if (count > maxCount) {
	                maxCount = count;
	            }
	        }

	        // Print the maximum repeated character count
	        System.out.println("Maximum repeated character count in the string " + str + ": " + maxCount);
	    }
	}