package org.JavaPrograms;
import java.util.Scanner;
public class MatrixAddition {
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = input.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int cols = input.nextInt();

	        int[][] matrix1 = new int[rows][cols];
	        int[][] matrix2 = new int[rows][cols];
	        int[][] result = new int[rows][cols];

	        System.out.println("Enter the elements of matrix1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix1[i][j] = input.nextInt();
	            }
	        }

	        System.out.println("Enter the elements of matrix2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix2[i][j] = input.nextInt();
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        System.out.println("Resultant matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

