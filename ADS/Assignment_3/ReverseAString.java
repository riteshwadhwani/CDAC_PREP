import java.util.Scanner;

class Stack{
	private int size ;
	private int top;
	private int[] arr;
	
	Stack(){
		this(10);
	}
	Stack(int size){
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	public void push(int element){
		if(top >= size-1){
			System.out.println("Stack Overflow");
		}
		else{
			arr[++top] = element;
		}
	}
	public int pop(){
		if(top == -1){
			System.out.println("Stack UnderFlow");
			return -1;
		}
			return arr[top--];
	}
	public int top(){
		if(top == -1){
			return -1;
		}
		return arr[top];
	}
}

class ReverseAString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		Stack s = new Stack();
		 for(int i =0;i<str.length();i++){
			 char ch = str.charAt(i);
			 s.push((int)ch);
		 }
		 String ans = "";
		 while(s.top() != -1){
			 ans += (char)s.top();
			 s.pop();
		 }
		 System.out.println("Ans : " + ans);
	}
}