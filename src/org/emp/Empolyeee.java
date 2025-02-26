package org.emp;

public class Empolyeee {

	// Non Parameterized constructor

	public Empolyeee() {

		System.out.println("default constructor");

	}
	// Parameterized constructor

	public Empolyeee(String name) {

		System.out.println("Empolyee name:" + name);

	}
  //Here we extending the aruguments counts or else it will throw error
	public Empolyeee(String name, int id) {

		System.out.println("Empolyee name:" + name + "\nid : " + id);

	}

	public Empolyeee(long phone) {

		System.out.println("Empolyee phone : " + phone);
		
	}
	public static void main(String[] args) {
		
	
		Empolyeee e = new Empolyeee();//when the object is created constructor will invoke automatically
		Empolyeee e1 = new Empolyeee("bala");
		Empolyeee e2 = new Empolyeee("mani",1234);
		Empolyeee e3 = new Empolyeee("9787807042l");

	}
}