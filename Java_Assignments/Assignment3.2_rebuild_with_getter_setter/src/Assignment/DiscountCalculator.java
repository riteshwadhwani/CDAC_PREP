package Assignment;
import java.util.Scanner;
public class DiscountCalculator {
	private float originalPrice;
	private float discountRate;
	private float discountedAmount;
	Scanner sc = new Scanner(System.in);
	public float getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}
	public float getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	public float getDiscountedAmount() {
		return discountedAmount;
	}
	public void setDiscountedAmount(float discountedAmount) {
		this.discountedAmount = discountedAmount;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
