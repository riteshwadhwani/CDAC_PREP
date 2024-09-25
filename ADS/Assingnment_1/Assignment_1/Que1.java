import java.util.Scanner;
import java.lang.Math;
class Que2{
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int sum =0;
		
		while(value!=0){
			int rem = value%2;
			sum += Math.pow(rem,2);
			value = value/10;
		}
		
		if(sum%2 == 0){
			System.out.println("Not Armstrong");
		}
		else{
			System.out.println("Armstrong number");
		}
		
	}
}