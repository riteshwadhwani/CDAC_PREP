package Array_question_8;

import java.util.Scanner;

public class Array {
	private  int[] arr ;
	private int index;
	public static Scanner sc = new Scanner(System.in);
	Array(){
		this(5);
	}
	Array(int size ){
		arr = new int[size];
	}
	public int getElement(int index) {
		if(this.index == 0 || this.index<=index) {
			System.out.println("Accessing OutOfBounds Index");
			return -1;
		}
		else {
			return this.arr[index];
		}
	}
	public void setElement() {
		System.out.println("Enter the value for index " + (index));
		arr[index++] = sc.nextInt();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the value of size of array");
		int size = sc.nextInt();
		Array a = new Array(size);
		for(int i =0;i<size;i++) {
			a.setElement();
		}
		for(int i =0;i<size;i++) {
			System.out.print(a.getElement(i) + " ");
		}
	}
}

