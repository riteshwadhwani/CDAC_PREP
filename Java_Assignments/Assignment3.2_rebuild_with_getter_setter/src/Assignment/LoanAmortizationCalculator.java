package Assignment;
import java.util.Scanner;
public class LoanAmortizationCalculator {
			private int principal;
			private float monthlyInterestRate;
			private float numberOfmonths;
			private double monthlyPayment;
			
			public int getPricipal() {
				return this.principal;
			}
			public void setPrincipal(int principal) {
				this.principal = principal;
			}
			public float getMonthlyInterestRate() {
				return this.monthlyInterestRate;
			}
			public void setMonthlyInterestRate(float monthlyInterestRate) {
				this.monthlyInterestRate = monthlyInterestRate;
			}
			public float getNumberOfMonths() {
				return this.numberOfmonths;
			}
			public void setNumberOfMonths(float numberOfmonths) {
				this.numberOfmonths = numberOfmonths;
			}
			public double getmonthlyPayment() {
				return this.monthlyPayment;
			}
			public void setmonthlyPayment(double monthlyPayment) {
				this.monthlyPayment = monthlyPayment;
			}
	
}
