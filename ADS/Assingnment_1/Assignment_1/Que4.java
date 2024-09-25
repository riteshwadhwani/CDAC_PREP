import java.util.Scanner;

class Que4{
	public static int findFibonacci(int value){
		if(value<=1){
			return value;
		}
		return findFibonacci(value-1) + findFibonacci(value-2);
	}
	public static void main(String[] arr){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for(int i =0;i<value;i++){
			System.out.println(findFibonacci(i) + " ");
		}
		
	}
}