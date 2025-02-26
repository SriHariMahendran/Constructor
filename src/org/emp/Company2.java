package org.emp;

public class Company2 {
	
	public Company2() { //4
		System.out.println("parent default constructor");
		
		
	}
	
	public Company2(float salary) {//2
		this(638301);
		System.out.println("empolyee salary:" +salary);
	
}
	
	public Company2(int Pincode) {
		System.out.println("empolyee pincode:" +Pincode);//1
		
	}
	
}