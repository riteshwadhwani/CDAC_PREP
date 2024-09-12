package org.vehicle;

public class Car extends Vehicle{
	private String model ;
	
	Car(){
		this.model = "";
	}
	Car(int year,String model){
		super(year);
		this.model = model;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Model	:	" + this.model);
	}
	
}
