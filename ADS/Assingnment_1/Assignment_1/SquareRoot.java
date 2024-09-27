import java.util.Scanner;

class SquareRoot{
	static void findSquareRoot( int value , int i){
		int sq = i * i;
		if(sq > value){
			System.out.println("ans : " + (i-1) );
			return;
		}
		findSquareRoot(value,i+1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i =1;
		 findSquareRoot(num,i);
		
	}
}