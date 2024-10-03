import java.util.Stack;
import java.util.Scanner;
class BalancedParenthesis{
	static boolean checkBalance(String str){
		Stack<Character> s = new Stack<>();
		for(int i =0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == '(' || ch == '{' || ch == '['){
				s.push(ch);
			}
			else{
				if(s.empty()){
					return false;
				}
				else{
				if(ch == ')' && s.peek() == '('){
					s.pop();
				}
				else if(ch == '}' && s.peek() == '{'){
					s.pop();
				}
				else if(ch == ']' && s.peek() == '['){
					s.pop();
				}
				else{
					return false;
				}
				}
			}
			
		}
		if(s.empty()){
				return true;
			}
			else{
				return false;
			}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
		boolean balanced = checkBalance(str);
		if(balanced){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Not Balanced");
	    }
}
	}