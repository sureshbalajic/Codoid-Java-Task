package org.JavaPrograms;



public class OverloadingDataTypes {
	public void phoneInfo() {
		System.out.println("Phone Information");

	}
	public void phoneInfo(String name) {
		System.out.println("Phone Name:"+name);
	}
	
	public void phoneInfo(int year ) {
		System.out.println("No Of Year Used:"+ year );
	}
	public void phoneInfo(int model, float rating ) {
		System.out.println("Phone Model:"+model + "\nPhone Rating:"+rating);
		
	}
	public void phoneInfo(float price,int pixel) {
		System.out.println("Phone Price in Euro:"+price+"\n Phone Camera Pixel:"+pixel +"MP");
		
	}
	
	public static void main(String[] args) {
		OverloadingDataTypes p = new OverloadingDataTypes();
		p.phoneInfo();
		p.phoneInfo("Apple");
		p.phoneInfo(01);
		p.phoneInfo(12, 9.8f);
		p.phoneInfo(88.8f, 32);
	}
	
	
	
}
