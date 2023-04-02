package org.JavaPrograms;

public class MyClass{

public static class GetnameJava {
	
    public static void main(String[] args) {
    	
        MyClass obj = new MyClass();
        String className = obj.getClass().getName();
        System.out.println("Class name: " + className);
    }
}
}