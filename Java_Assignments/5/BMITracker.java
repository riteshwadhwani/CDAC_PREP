package Assignment;
import java.util.Scanner;
public class BMITracker {
	private float weight;
	private float height;
	private double BMI;
	private String category;
	Scanner sc = new Scanner(System.in);
	void acceptRecord() {
		System.out.println("Enter your weight");
		this.weight = sc.nextFloat();
		System.out.println("Enter your height in meters");
		this.height = sc.nextFloat();
	}
	void calculateBMI() {
		this.BMI = this.weight / (this.height * this.height);
	}
	void classifyBMI () {
		if(this.BMI < 18.5) {
			this.category = "Underweight";
		}
		else if(this.BMI >= 18.5 && this.BMI < 29.9) {
			this.category = "Normal Weight";
					
		}
		else if(this.BMI >=25 && this.BMI <29.9 ) {
			this.category = "Overweight";
		}
		else {
			this.category = "Obese";		
		}
	}
	void printRecord () {
		System.out.println(this.category);
	}
}
