import java.util.Scanner;

class ReverseWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		String[] arr = s.split(" ");
		String str = "";
		for(int i = arr.length -1; i>=0;i--){
		  if(i==0){
			  str += arr[i];
		  }
		  else{
			  str += arr[i] + " ";
		  }
		}
		System.out.println("Ans : " + str);
	}
	
}