package Assignment;
import java.util.Scanner;
public class TollBoothRevenueManager {
	private int tollRateForCar;
	private int noOfCars;
	private int tollrateForBus;
	private int noOfBuses;
	private int tollrateForTruck;
	private int noOfTruck;
	private int totalRevenue;
	Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		
		System.out.println("Enter the number of cars ");
		this.noOfCars = sc.nextInt();
		
		System.out.println("Enter the number of buses");
		this.noOfBuses = sc.nextInt();
		
		System.out.println("Enter the num of truck");
		this.noOfTruck = sc.nextInt();
	}
	void setTollRates() {
		System.out.println("Enter the toll rate of car");
		this.tollRateForCar = sc.nextInt();
		System.out.println("Enter the toll rate of Bus");
		this.tollrateForBus = sc.nextInt();
		System.out.println("Enter the toll rate of truck");
		this.tollrateForTruck = sc.nextInt();
	}
	void calculateRevenue () {
		this.totalRevenue = (this.noOfCars * this.tollRateForCar) + (this.noOfBuses * this.tollrateForBus) + (this.noOfTruck * this.tollrateForTruck);
		
	}
	void printRecord () {
		System.out.println("Revenue is : " + this.totalRevenue);
	}
}
