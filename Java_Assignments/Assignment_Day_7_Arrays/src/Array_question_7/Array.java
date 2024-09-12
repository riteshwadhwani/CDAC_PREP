package Array_question_7;

import java.util.Scanner;

public class Array {
	public static int[] arr ;
	public static Scanner sc = new Scanner(System.in);
	Array(){
		this(5);
	}
	Array(int size ){
		arr = new int[size];
	}
	public static void acceptRecord() {
		for(int i =0;i<Array.arr.length;i++) {
			System.out.println("Enter the value of index " + i);
			Array.arr[i] = sc.nextInt();
		}
	}
	public static void printRecord() {
		for(int i =0;i<Array.arr.length;i++) {
			System.out.print(Array.arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		a.acceptRecord();
		a.printRecord();
	}
}
