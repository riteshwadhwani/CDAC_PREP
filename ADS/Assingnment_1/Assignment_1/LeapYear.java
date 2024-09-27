import java.util.Scanner;


class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int value = sc.nextInt();
		
		if(value%4==0 && value %100==0){
			System.out.println("Leap Year");
		}
		else if (value %400==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not Leap Year");
		}
		
	}
}