package org.JavaPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

	

	public class SetToStream {
	    public static void main(String[] args) {
	        Set<Integer> set = new HashSet<>();
	        set.add(1);
	        set.add(2);
	        set.add(3);

	        Stream<Integer> stream = set.stream();

	        stream.forEach(System.out::println);
	    }
	}
