

class Stack{
	private int size;
	private int top ;
	private int[] arr;
	private int min = Integer.MAX_VALUE;;
	Stack(int size){
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	void push(int element){
		if(top == size -1){
			System.out.println("Stack Overflow");
			return;
		}
		if(min>element){
			min = element;
		}
		arr[++top] =element;
	}
	
	void pop(){
		if(top == -1){
			System.out.println("Stack Underflow");
		}
		top--;
	}
	int getMin(){
		return min;
	}
	public static void main(String[] args){
		Stack s = new Stack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println("Min: " + s.getMin());
	}
}