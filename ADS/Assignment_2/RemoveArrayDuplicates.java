import java.util.Scanner;

class RemoveArrayDuplicates{
	public static void main(String [] args){
		int[] arr = {0,0,1,1,2,2,3,3};
		
		int ans = arr.length;
		
		for(int i =0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1]){
				ans--;
			}
		}
		System.out.println("Ans : " + ans);
		
	}
}

