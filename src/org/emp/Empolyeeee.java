package org.emp;

//By using this() keyword
//==================================

public class Empolyeeee {

	//1.To call one constructor to another constructor is called constructor chaining 
	//2.Two keywords 1. this() 2. super()
	//3.This() -> to call current class constructor 
	//4.super()-> to call parent class constructor
	
	
	// Non Parameterized constructor

		public Empolyeeee() { //4
			
			this("bala");

			System.out.println("default constructor");
		}
		// Parameterized constructor

		public Empolyeeee(String name) { //3
			
          this(97878070422l);
			System.out.println("Empolyee name:" + name);

		}
	  
		public Empolyeeee(String name, int id) { //1
           
			System.out.println("Empolyee name:" + name + "\nid : " + id);
		}
		public Empolyeeee(long phone) { //2

			this("Hari", 1234);
			System.out.println("Empolyee phone : " + phone);
			
		}
		public static void main(String[] args) {
			
			Empolyeeee e = new Empolyeeee();//when the object is created constructor will invoke automatically
			
  //1.Here we have given the this("bala")keyword in d.constructor , its skips the default constructor and wat we passed in 
 //this (string name) keyword inside , that will invoke first 
 //2.And for (string name) we got control from d.constructor and it will get exceute 2nd and terminate this is called cons chaining
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}