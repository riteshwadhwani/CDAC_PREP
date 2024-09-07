package Assignment;
import java.util.Scanner;
public class CompoundInterestCalculator {
	private int principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private double totalInterest;
	Scanner sc = new Scanner(System.in);
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public float getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(float annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfCompounds() {
		return numberOfCompounds;
	}
	public void setNumberOfCompounds(int numberOfCompounds) {
		this.numberOfCompounds = numberOfCompounds;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
