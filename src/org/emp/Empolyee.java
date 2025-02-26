package org.emp;

public class Empolyee {
	
	//1. class name & constructor name should be same and Its a spl method so it does not have any return type
	//2. whenever the object is created constructor get invoke automatically 
	//3.Parameterized constructor -> Arugument based constructor
	//4.Non parameterized constructor -> Default constructor 
	//5.Once the constructor is created again we cant create the constructor, so we should do  copy and paste

	
	public Empolyee() { // here we dont have void bz it is a constructor and doest not have return type
		
		System.out.println("Iam a constructor");
		
	}
	
	private void empid() {
		System.out.println("Iam a method");
		
	}
		
		public static void main(String[] args) {
		
		Empolyee e = new Empolyee();// when the object is created constructor will invoke automatically
		
		
		e.empid();// method called here means it will execute the (Iam method)
		
	}
	
	
}
