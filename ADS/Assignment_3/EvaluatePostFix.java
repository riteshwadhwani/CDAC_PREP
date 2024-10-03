import java.util.Stack;
import java.util.Scanner;
import java.lang.Integer;


class EvaluatePostFix{
	static int solveExpression(String s){
		Stack<Integer> st = new Stack<>();
		for(int i =0;i<s.length();i++){
			if(s.charAt(i) == '*'){
				int a =  st.peek();
				st.pop();
				int b =  st.peek();
				st.pop();
				int ans = a * b;
				st.push( ans);
				
			}
			else if(s.charAt(i) == '+'){
				int a =  st.peek();
				st.pop();
				int b =  st.peek();
				st.pop();
				int ans = a + b;
				st.push( ans);
			}
			else if(s.charAt(i) == '-'){
				int a =  st.peek();
				st.pop();
				int b =  st.peek();
				st.pop();
				int ans = a - b;
				st.push( ans);
			}
			else if(s.charAt(i) == '/'){
				int a =  st.peek();
				st.pop();
				int b =  st.peek();
				st.pop();
				int ans = a / b;
				st.push( ans);
			}
			else{
				int value = Integer.parseInt(s.substring(i,i+1));
				st.push(value);
			}
		}
		return st.peek();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		int ans = solveExpression(s);
		
		System.out.println("Ans : " + ans);
	}
}