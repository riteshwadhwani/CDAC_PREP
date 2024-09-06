package Assignment;
import java.util.Scanner;
public class DiscountCalculator {
	private float originalPrice;
	private float discountRate;
	private float discountedAmount;
	Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		System.out.println("Enter the origin price");
		this.originalPrice = sc.nextFloat();
		System.out.println("Enter the discounted rate");
		this.discountRate = sc.nextFloat();
	}
	void calculateDiscount () {
		this.discountedAmount = this.originalPrice * (this.discountRate / 100);
	}
	void printRecord () {
		System.out.printf(this.originalPrice + " " + this.discountRate + "Discounted Amount " + this.discountedAmount);
	}
}
