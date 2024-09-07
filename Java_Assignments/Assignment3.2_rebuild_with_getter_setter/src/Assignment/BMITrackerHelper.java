package Assignment;
import java.util.Scanner;

public class BMITrackerHelper {
private BMITracker b = new BMITracker();
		Scanner sc = new Scanner(System.in);
		void acceptRecord() {
			System.out.println("Enter your weight");
			b.setWeight(sc.nextFloat());
			System.out.println("Enter your height in meters");
			b.setHeight(sc.nextFloat());;
			calculateBMI();
			classifyBMI();
		}
		void calculateBMI() {
			System.out.println("weight:" + b.getWeight());
			System.out.println("height:" + b.getHeight());
			
			double BMI = (b.getWeight() /(Math.pow(b.getHeight(), 2)));
			b.setBMI(BMI);
		}
		void classifyBMI () {
			if(b.getBMI() < 18.5) {
				b.setCategory("Underweight");
			}
			else if(b.getBMI() >= 18.5 && b.getBMI() < 29.9) {
				b.setCategory("Normal Weight");
						
			}
			else if(b.getBMI() >=25 && b.getBMI() <29.9 ) {
				b.setCategory("Overweight"); 
			}
			else {
				b.setCategory("Obese");	
			}
		}
		void printRecord () {
			System.out.println("Weight : " + b.getWeight());
			System.out.println("Height : " + b.getHeight());
			System.out.println("BMI : " + b.getBMI());
			System.out.println("Category : " + b.getCategory());
		}
}
