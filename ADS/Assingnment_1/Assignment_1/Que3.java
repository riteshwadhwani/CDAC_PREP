import java.util.Scanner;

class Que3{
	public static int findFactorial(int value){
		if(value ==1){
			return 1;
		}
		int ans = value * findFactorial(value-1);
		return ans;
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int ans = findFactorial(value);
		System.out.println("Ans : " + ans);
		
	}
}