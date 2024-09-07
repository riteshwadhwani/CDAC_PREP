package Assignment;

import java.util.Scanner;

public class DiscountCalculatorHelper {
private DiscountCalculator d = new DiscountCalculator();

		Scanner sc = new Scanner(System.in);
		
		void acceptRecord() {
			System.out.println("Enter the original price");
			d.setOriginalPrice(sc.nextFloat()); ;
			System.out.println("Enter the discounted rate");
			d.setDiscountRate(sc.nextFloat());;
			calculateDiscount();
		}
		void calculateDiscount () {
			float discountedAmount = d.getOriginalPrice() * (d.getDiscountRate() / 100);
			d.setDiscountedAmount(discountedAmount);
		}
		void printRecord () {
			System.out.println("Original Price " + d.getOriginalPrice());
			System.out.println("Discount Rate " + d.getDiscountRate());
			System.out.println("Discounted Amount" + d.getDiscountedAmount());
			System.out.println("Remaining Amount" + (d.getOriginalPrice() - d.getDiscountedAmount()));
			
		}
}
