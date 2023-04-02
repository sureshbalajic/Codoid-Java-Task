package org.JavaPrograms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleExceptionHandling {
	
	
	    public static void main(String[] args) {
	        try {
	            FileInputStream fileInputStream = new FileInputStream("myFile.txt");
	            byte[] fileContent = new byte[1024];
	            fileInputStream.read(fileContent);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading the file.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred.");
	        }
	    }
	}

