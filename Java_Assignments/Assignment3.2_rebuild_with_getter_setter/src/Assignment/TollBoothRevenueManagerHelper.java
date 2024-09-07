package Assignment;

import java.util.Scanner;

public class TollBoothRevenueManagerHelper {
private TollBoothRevenueManager t = new TollBoothRevenueManager();

		Scanner sc = new Scanner(System.in);
		
		void acceptRecord() {
			
			System.out.println("Enter the number of cars ");
			 t.setNoOfCars(sc.nextInt());
			
			System.out.println("Enter the number of buses");
			t.setNoOfBuses(sc.nextInt());;
			
			System.out.println("Enter the num of truck");
			t.setNoOfTruck(sc.nextInt());
			setTollRates();
			
		}
		void setTollRates() {
			System.out.println("Enter the toll rate of car");
			t.setTollRateForCar( sc.nextInt());
			System.out.println("Enter the toll rate of Bus");
			t.setTollrateForBus(sc.nextInt());
			System.out.println("Enter the toll rate of truck");
			t.setNoOfTruck(sc.nextInt());
			calculateRevenue();
		}
		
		void calculateRevenue () {
			int totalRevenue = (t.getNoOfCars() * t.getTollRateForCar()) + (t.getNoOfBuses() * t.getTollrateForBus()) + (t.getNoOfTruck() * t.getTollrateForTruck());
			t.setTotalRevenue(totalRevenue);
		}
		void printRecord () {
			System.out.println("Revenue is : " + t.getTotalRevenue());
		}
}
