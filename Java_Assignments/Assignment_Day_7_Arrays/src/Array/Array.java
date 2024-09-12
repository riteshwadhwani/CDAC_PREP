package Array;

import java.util.Scanner;

public class Array {
	private static Scanner sc = new Scanner(System.in);
		public static void mainQ1(String[] args) {
			int arr[] = new int[] {10,20,30,40,50};
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i] +" ");
			}
			System.out.println();
			for(int i = 0 ;i<arr.length;i++ ) {
				System.out.println("Enter the value at index " + i);
				arr[i] = sc.nextInt();
			}
			for(int i =0;i<5;i++) {
				System.out.print(arr[i] +" ");
			}
	
		}
		
		/////////////////////////////////////////////////
		public static void acceptRecord(int arr[]) {
			for(int i =0;i<arr.length;i++) {
				System.out.println("Enter the value at index " + i);
				arr[i] = sc.nextInt();
			}
		}
		public static void printRecord(int arr[]) {
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		public static void mainQ2(String[] args) {
			int arr[] = new int[5];
			Array.acceptRecord(arr);
			Array.printRecord(arr);
		}
		///////////////////////////////////////////////////////
		
		public static int findMini(int arr[]) {
			int mini = Integer.MAX_VALUE;
			for(int i =0;i<arr.length;i++) {
				if(arr[i]<mini) {
					mini = arr[i];
				}
			}
			return mini;
		}
		public static int findMaxi(int arr[]) {
			int maxi = Integer.MIN_VALUE;
			for(int i =0;i<arr.length;i++) {
				if(arr[i]>maxi) {
					maxi = arr[i];
				}
			}
			return maxi;
		}
		public static void mainQ3(String[] args) {
			int arr[] = new int[5];
			Array.acceptRecord(arr);
			int minValue = Array.findMini(arr);
			int maxValue = Array.findMaxi(arr);
			System.out.println("Min : " + minValue);
			System.out.println("Max : "+ maxValue);
			
			
		}
		////////////////////////////////////////////
		
		
		public static int[] removeDuplicate(int arr[]) {
			int count =0;
			
			for(int i =0;i<arr.length-1;i++) {
				for(int j = i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						arr[j] = -1;
						count++;
					}
				}
			}
			int size = arr.length -count;
			int brr[] = new int[size];
			int index = 0;
			for(int i =0;i<arr.length;i++) {
				if(arr[i]==-1) {
					continue;
				}
				else {
					brr[index++] = arr[i];
				}
			}
			return brr;
		}
		
		public static void main(String[] args) {
			int arr[] = new int[5];
			Array.acceptRecord(arr);
			
			int brr[] = removeDuplicate(arr);
			Array.printRecord(brr);
			
		}
		/////////////////////////////////////////////////// Pending
		
		
		public static void mainQ5(String[] args) {
			int arr[] = new int[5];
			Array.acceptRecord(arr);
			
			
		}
		
		////////////////////////////////////////////////////
		
		public static int[] sort(int [] arr) {
			int[] brr = arr;
			for(int i =0;i<brr.length-1;i++) {
				for(int j =i+1;j<brr.length;j++) {
					if(brr[i]>brr[j]) {
						int temp = brr[i];
						brr[i] = brr[j];
						brr[j] = temp;
					}
				}
			}
			return brr;
		}
		
		public static int findMissing(int [] arr) {
			Array.sort(arr);
			int size = 0;
			for(int i =0;i<arr.length-1;i++) {
				if(arr[i]+1!=arr[i+1]) {
					return (arr[i] +1);
				}
			}
			return -1;
		}
		
		public static void mainQ6(String[] args) {
			int arr[] = new int[5];
			Array.acceptRecord(arr);
			
			int missingNumber = Array.findMissing(arr);
			System.out.println("miss : " + missingNumber);
			
		}
		////////////////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
