package org.emp;

//By using super keyword

public class Company extends Company2{
	
	//Non Parameterized constructor
	public Company() {//3
		super(978.78070f);// To block the invoke of parent d.constructor we use super keyword
		System.out.println("child default constructor");
		
	}
	
	//Parameterized constructor
	public Company(String name) {//5

		System.out.println("Empolyee name:" + name);
		
		
}
	public static void main(String[] args) {
		
		Company e = new Company();
//1. when we create object again and again parent default constructor invoke again and again 
		
		Company e1 = new Company("Maddy");
		
		
	}
}