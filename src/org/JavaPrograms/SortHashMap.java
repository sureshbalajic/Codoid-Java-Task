package org.JavaPrograms;

import java.util.*;

public class SortHashMap {
	

	
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("John", 25);
	        map.put("Jane", 30);
	        map.put("David", 20);
	        map.put("Bob", 35);

	        // Sort the hashmap by value
	        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return (o1.getValue()).compareTo(o2.getValue());
	            }
	        });

	        // Put sorted data from hashmap to a new LinkedHashMap
	        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        // Print the sorted map
	        System.out.println("Sorted HashMap by Value:");
	        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
	}
