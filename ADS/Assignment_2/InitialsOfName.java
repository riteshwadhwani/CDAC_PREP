import java.util.Scanner;
class InitialsOfName{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		
		String[] arr = s.split(" ");
		
		for(String a : arr){
			System.out.print(a.charAt(0)+ " ");
		}
		
		
	}
}