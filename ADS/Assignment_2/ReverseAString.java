import java.util.Scanner;

class Stack{
	int size ;
	int top ;
	int[] arr;
	
	Stack(){
		this.size = 10;
		top = -1;
		arr = new int[size];
	}
	Stack(int size){
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	
	int top(){
		if(top ==-1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
		return arr[top];
	}
	boolean isEmpty(){
		return (top<0);
	}
	boolean push(int a ){
		if(top >= size -1){
			System.out.println("Stack OverFlow");
			return false;
		}
		arr[++top] = a;
		return true;
	}
	int length(){
		if(top == -1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
		return top;
	}
	int pop(){
		if(top == -1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
		return arr[top--];
	}
}
class ReverseAString{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the Stack");
			int size = sc.nextInt();
			Stack s = new Stack(size);
			System.out.println("Enter the string");
			String str = sc.nextLine();
			if(str.length() > size){
				System.out.println("Incorrect length of the string.");
			}
			for(int i =0;i<str.length();i++){
				int ch = (int)str.charAt(i);
				s.push(ch);
			}
			String ans = "";
			while(!s.isEmpty()){
				char c = (char)s.pop();
				ans += c;
			}
			System.out.println("Reverse : " + ans);
		}
}