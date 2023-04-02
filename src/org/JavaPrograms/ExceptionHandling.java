package org.JavaPrograms;

public class ExceptionHandling {
	
	    public static void main(String[] args) throws Exception {
	        divideNumbers(10, 0); // The divideNumbers method may throw an Exception
	    }

	    public static int divideNumbers(int a, int b) throws Exception {
	        if (b == 0) {
	            throw new Exception("Cannot divide by zero"); // Throwing an Exception if b is zero
	        }

	        return a / b;
	    }
	}

