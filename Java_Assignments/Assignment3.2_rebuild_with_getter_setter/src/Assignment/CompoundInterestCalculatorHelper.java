package Assignment;
import java.util.Scanner;
public class CompoundInterestCalculatorHelper {
		private CompoundInterestCalculator c = new CompoundInterestCalculator();
		
		Scanner sc = new Scanner(System.in);

		void acceptRecord () {
			System.out.println("Enter the investment amount");
			c.setPrincipal(sc.nextInt());;
			System.out.println("Enter the annual interest rate");
			c.setAnnualInterestRate(sc.nextFloat()); ;
			System.out.println("Enter the number of times the interest is compounded per year");
			c.setNumberOfCompounds(sc.nextInt());
			System.out.println("Enter the investment duration");
			c.setYears(sc.nextInt());
			calculateFutureValue();
			}
		void calculateFutureValue() {
			double futureValue = c.getPrincipal() * Math.pow((1 + c.getAnnualInterestRate() / c.getNumberOfCompounds()),(c.getNumberOfCompounds() * c.getYears()));
			c.setTotalInterest(futureValue - c.getPrincipal());
		}
		void printRecord () {
			System.out.println("Amount : " + c.getPrincipal());
			System.out.println("Annal Interest : " + c.getAnnualInterestRate());
			System.out.println("No. of compounds : " + c.getNumberOfCompounds());
			System.out.println("For Years : " + c.getYears() );
			System.out.println("Total Interest " + c.getTotalInterest() );
		}

}
