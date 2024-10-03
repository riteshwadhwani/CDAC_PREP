import java.util.Scanner;


class ReverseANumber{
	static void reverseNumber(int value ,int ans){
		if(value == 0){
			System.out.println("Ans : " + ans);
			return;
		}
		ans = ans* 10 + value%10;
		
		reverseNumber(value/10, ans);
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int value = sc.nextInt();
		int ans = 0;
		reverseNumber(value , ans);
		
	}
}