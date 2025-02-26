package org.emp;

public class TrailPage {
	
	public TrailPage() {
		
		this("bala");
		
		System.out.println("d constructor is best");
			
	}
	
	public TrailPage(String name) {
		
		
		
		System.out.println("empolyee name " + name);
		
	}
	
	public TrailPage(String name, int id) {
		
		System.out.println("employee name: "+name+ "\n id:"+id );
	}
	
	public TrailPage(long phone) {
		this("mani,1234");
		System.out.println("employee phone :"+phone);
	}
	
	public static void main(String[] args) {
		
		TrailPage e = new TrailPage();
		
		
		
		
		
	}
	
}