package Assignment;
import java.util.Scanner;
public class LoanAmortizationCalculator {
	private int principal;
	private float monthlyInterestRate;
	private float numberOfmonths;
	private double monthlyPayment;
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
	System.out.println("Enter the principle amount");
	this.principal = sc.nextInt();
	System.out.println("Enter the annual interest rate");
	float annualInterest = sc.nextFloat();
	this.monthlyInterestRate = (annualInterest/12) / 100;
	System.out.println("Enter the loan term");
	float years = sc.nextFloat();
	this.numberOfmonths = (years * 12);

	}
	public void calculateMonthlyPayment() {
		this.monthlyPayment = this.principal * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate),(numberOfmonths)))) / (Math.pow((1 + monthlyInterestRate),(numberOfmonths)) - 1);
		
	}
	public void printRecord () {
		System.out.println(this.monthlyPayment);
	}
}
