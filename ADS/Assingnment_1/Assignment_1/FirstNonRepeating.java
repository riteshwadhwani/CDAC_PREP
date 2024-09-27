import java.util.Scanner;

class FirstNonRepeating{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] map = new int[200];
		
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			map[ch + 0]++;
		}
		
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			if(map[ch + 0]>1){
				System.out.println(ch);
				break;
			}
		}
		
	}
}