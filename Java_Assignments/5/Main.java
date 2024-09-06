package Assignment;

public class Main {
		public static void main(String[] args) {
			LoanAmortizationCalculator l =new LoanAmortizationCalculator();
//			l.acceptRecord();
//			l.calculateMonthlyPayment();
//			l.printRecord();
//			CompoundInterestCalculator c = new CompoundInterestCalculator();
//			c.acceptRecord();
//			c.calculateFutureValue();
//			c.printRecord();
//			BMITracker bi = new BMITracker();
//			bi.acceptRecord();
//			bi.calculateBMI();
//			bi.classifyBMI();
//			bi.printRecord();
			
//			DiscountCalculator d = new DiscountCalculator();
//			
//			d.acceptRecord();
//			d.calculateDiscount();
//			d.printRecord();
			TollBoothRevenueManager t = new TollBoothRevenueManager();
			t.acceptRecord();
			t.setTollRates();
			t.calculateRevenue();
			t.printRecord();
		}
}
