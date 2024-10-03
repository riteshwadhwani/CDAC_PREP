import java.util.Stack;
import java.util.Scanner;

class InfixToPostfix{
	static boolean isCharacter(char ch){
		int value = (int) ch;
		if(value >= 65 && value <=127){
			return true;
		}
		return false;
	}
	static void getPostfix(String s){
		Stack<Character> st = new Stack<>();
		for(int i =0;i<s.length();i++){
			char ch = s.charAt(i);
			if(isCharacter(ch)){
				System.out.print(ch + " ");
			}
			else{
				st.push(ch);
			}
		}
		while(!st.empty()){
			System.out.print(st.peek() + " ");
			st.pop();
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		getPostfix(s);
	}
}