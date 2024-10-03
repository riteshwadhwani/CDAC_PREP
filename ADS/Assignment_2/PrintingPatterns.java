import java.util.Scanner;

class PrintingPatterns{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int i =0;i<value;i++){
			for(int j =0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}