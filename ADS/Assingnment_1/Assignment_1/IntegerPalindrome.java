

import java.util.Scanner;

class IntegerPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int value = sc.nextInt();
		int ans = 0;
		while(value!=0){
			int rem = value %10;
			
			ans = ans*10 + rem;
			
			value = value/10;
			
		}
		
		System.out.println("Ans : " + ans);
		
	}
}
