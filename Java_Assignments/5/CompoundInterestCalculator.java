package Assignment;
import java.util.Scanner;
public class CompoundInterestCalculator {
	private int principal;
	private float annualInterestRate;
	private int numberOfCompounds;
	private int years;
	private double totalInterest;
	Scanner sc = new Scanner(System.in);
	void acceptRecord () {
		System.out.println("Enter the investment amount");
		this.principal = sc.nextInt();
		System.out.println("Enter the annual interest rate");
		this.annualInterestRate = sc.nextFloat();
		System.out.println("Enter the number of times the interest is compounded per year");
		this.numberOfCompounds = sc.nextInt();
		System.out.println("Enter the investment duration");
		this.years = sc.nextInt();
	}
	void calculateFutureValue() {
			double futureValue = principal * Math.pow((1 + annualInterestRate / numberOfCompounds),(numberOfCompounds * years));
			this.totalInterest = futureValue - principal;
	}
	void printRecord () {
		System.out.println("Total Interest is" + this.totalInterest);
	}
}
