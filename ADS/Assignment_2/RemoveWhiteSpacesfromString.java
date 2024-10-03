import java.util.Scanner;

class RemoveWhiteSpacesfromString{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		
		String[] strs  = s.split(" ");
		String ans = "";
		for(String s1 : strs){
			if(s1.length() == 0){
				continue;
			}
			else{
				ans +=s1;
			}
		}

		
		//String str = s.replaceAll(" ","");
		System.out.println("Ans : "+ ans);
		
	}
}