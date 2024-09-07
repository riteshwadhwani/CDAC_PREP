package Assignment;

import java.util.Scanner;

public class LoanAmortizationCalculatorHelper {
private LoanAmortizationCalculator l = new LoanAmortizationCalculator();


		Scanner sc = new Scanner(System.in);
		public void acceptRecord() {
		System.out.println("Enter the principle amount");
		l.setPrincipal(sc.nextInt());;
		System.out.println("Enter the annual interest rate");
		float annualInterestRate = sc.nextFloat();
		float monthlyInterestRate = (annualInterestRate/12) / 100 ;
		l.setMonthlyInterestRate(monthlyInterestRate);
		System.out.println("Enter the loan term");
		float years = sc.nextFloat();
		l.setNumberOfMonths( (years * 12)) ;
		
		try {
			calculateMonthlyPayment();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
		public void calculateMonthlyPayment() {
			double monthlyPayment = l.getPricipal() * (l.getMonthlyInterestRate() * (Math.pow((1 + l.getMonthlyInterestRate()),(l.getNumberOfMonths())))) / (Math.pow((1 + l.getMonthlyInterestRate()),(l.getNumberOfMonths())) - 1);
			l.setmonthlyPayment(monthlyPayment);
			
		}
		public void printRecord () {
			System.out.println("Amount : " + l.getPricipal());
			System.out.println("Monthly Interest Rate : " +l.getMonthlyInterestRate() );
			System.out.println("Duration int months: " + l.getNumberOfMonths());
			System.out.printf("Monthly Payment : " + l.getmonthlyPayment());
		}
}
