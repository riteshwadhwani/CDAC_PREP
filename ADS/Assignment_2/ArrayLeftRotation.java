import java.util.Scanner;

class ArrayLeftRotation{
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6};
		int rotation = 2;
		
		if(rotation > arr.length){
			rotation %= arr.length;
		}
		int j = arr.length -1;
		for(int i =0;i<rotation;i++){
			int a = arr[0];
			int k = 0;
			while(k<j-i){
				arr[k] = arr[k+1];
				k++;
			}
			arr[j-i] = a;
		}
		for(int a : arr){
			System.out.print(a + " ");
		}
		
	}
}