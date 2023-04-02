package org.overriding;



public class AxisBank extends Bank{

	 public void deposit() {
			System.out.println("Deposit Money:2000");
			
			}
			@Override
			public void saving() {
			
				super.saving();
			}
			@Override
			public void fixed() {
			
				super.fixed();
			}
	 public static void main(String[] args) {
				AxisBank b = new AxisBank();
				b.deposit();
				b.saving();
				b.fixed();
			}
}
