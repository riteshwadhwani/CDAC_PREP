

class Stack{
	private int size;
	private int top ;
	private int[] arr;
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
		arr[++top] =element;
	}
	
	void pop(){
		if(top == -1){
			System.out.println("Stack Underflow");
		}
		top--;
	}
	boolean isFull(){
		return top == size-1;
	}
	boolean isEmpty(){
		return top == -1;
	}
	int getTop(){
		if(top == -1){
			return -1;
		}
		return arr[top];
	}
	int getLength(){
		return top +1;
	}
}
class Queue{
	private int size;
	private Stack s;
	private Stack m;
	
	Queue(int size){
		this.size = size;
		s = new Stack(size);
		m = new Stack(size);
	}
	void push(int element){
		if(s.isFull())
			return;
		s.push(element);
	}
	void popLast(Stack s){
		if(s.getLength() == 1){
			s.pop();
			return;
		}
		int temp = s.getTop();
		s.pop();
		popLast(s);
		s.push(temp);
		
	}
	void pop(){
		if(s.isEmpty()){
			return;
		}
		popLast(s);
	}
	void pushToM(Stack s, Stack m){
		if(s.getTop() == -1){
			return;
		}
		int element = s.getTop();
		m.push(element);
		s.pop();
		pushToM(s,m);
		s.push(element);
	}
	int getFront(){
		if(m.getLength() != 0){
			while(!m.isEmpty()){
				m.pop();
			}
		}
		pushToM(s,m);
		return m.getTop();
	}
}
class QueueUsingStacks{
	public static void main(String[] args){
		Queue q = new Queue(5);
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		System.out.println("Front " + q.getFront());
		q.pop();
		System.out.println("Front " + q.getFront());
	}
}