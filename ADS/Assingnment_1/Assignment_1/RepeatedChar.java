import java.util.Scanner;

class RepeatedChar{
	public static void main(String [] ags){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		 StringBuilder str 
            = new StringBuilder(s); 
		String ans = "";
		for(int i =0;i<str.length()-1;i++){
			for(int j = i+1;j<str.length();j++){
			if(str.charAt(i) == '@'){
				continue;
			}
			else if(str.charAt(i) == str.charAt(j)){
				ans += s.charAt(i);
				str.setCharAt(i,'@');
				str.setCharAt(j,'@') ;
			}
			}
			
			
		}
		System.out.println("ans : " + ans);
	}
}