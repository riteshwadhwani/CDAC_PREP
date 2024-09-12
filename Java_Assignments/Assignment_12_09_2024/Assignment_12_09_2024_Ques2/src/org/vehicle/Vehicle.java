package org.vehicle;

public class Vehicle {
	private int year ;
	Vehicle(){
		this.year = 0;
	}
	Vehicle(int year){
		this.year = year;
	}
	public void displayDetails() {
		System.out.println("Year	:	" + this.year);
	}
}
