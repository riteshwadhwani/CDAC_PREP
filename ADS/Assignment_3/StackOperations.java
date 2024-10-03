

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
}

class StackOperations{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(5);
		s.push(3);
		s.push(7);
		int poppedElement = s.pop();
		
		System.out.println("Popped Element " + poppedElement);
	}
}