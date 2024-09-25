
import java.util.Scanner;
class FindPunctuations{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		
		
		int count = 0;
		
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			if(Character.isLetter(ch) || ch == ' ' ){
				continue;
			}
			else{
				count++;
			}
		}
		
		System.out.println("Total Punctuations " + count);
		
		
	}
}