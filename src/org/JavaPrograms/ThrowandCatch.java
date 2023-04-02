package org.JavaPrograms;

public class ThrowandCatch {

	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		try {
		
			System.out.println(1000/0);
		} catch (Exception e) {
			System.out.println("dontdivide by ");
			
			e.printStackTrace();
			
		    System.out.println(e.getMessage());
		}
		finally {
			System.out.println("done");
		}
		
	}

}
