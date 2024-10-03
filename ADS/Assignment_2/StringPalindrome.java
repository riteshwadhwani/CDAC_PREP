import java.util.Scanner;

class StringPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int i =0;
		int j = str.length()-1;
		boolean palindrome = true;
		while(i<=j){
			if( str.charAt(i) != str.charAt(j)){
				palindrome = false;
				break;
			}
			i++;  j--;
		}
	if(palindrome){
		System.out.println("String is Palindrome");
	}	
	else{
		System.out.println("String is Not Palindrome");
	}
	}
}