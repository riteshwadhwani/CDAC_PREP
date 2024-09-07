package Assignment;
import java.util.Scanner;
public class BMITracker {
	private float weight;
	private float height;
	private double BMI;
	private String category;
	
	public BMITracker() {
		this.weight = 0.0f;
		this.height = 0.0f;
		BMI = 0.0;
		this.category = "";
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	}
