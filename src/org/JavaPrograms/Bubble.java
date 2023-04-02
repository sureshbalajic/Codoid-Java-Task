package org.JavaPrograms;

public class Bubble {
	
	    public static void main(String[] args) {
	        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
	        int n = arr.length;

	        // perform bubble sort
	        for (int i = 0; i < n-1; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    // swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }

	        // print the sorted array
	        System.out.println("Sorted Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}

