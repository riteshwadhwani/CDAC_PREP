

class Que{
	private int size = 10;
	private int front;
	private int rare ;
	private int[] arr;
	Que(){
		front = -1;
		rare = -1;
		arr = new int[10];
	}
	
	boolean isEmpty(){
		return front == -1;
	}
	boolean isFull(){
		if(rare == size-1 && front ==0){
			return true;
		}
		else if(rare + 1 == front){
			return true;
		}
		return false;
	}
	
	void push(int element){
		if(isFull()){
			System.out.println("Queue is Full");
			return;
		}
		if(isEmpty()){
			front++;
		}
		rare = (rare+1) % size;
		arr[rare] = element;
	}
	void pull(){
		if(isEmpty()){
			return;
		}
		if(front == rare){
			front = -1;
			rare = -1;
			return;
		}
		front = (front +1 )% size;
	}
	int getFront(){
		if(isEmpty()){
			return  -1;
		}
		return arr[front];
	}
}

class CircularQueue{
	public static void main(String[] args){
		Que q = new Que();
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		q.push(60);
		q.push(70);
		q.push(80);
		q.push(90);
		q.push(100);
		while(!q.isEmpty()){
			int element = q.getFront();
			q.pull();
			System.out.print(element + " ");
		} 
	}
}