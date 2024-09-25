import java.util.Scanner;

class PrintRepeatingElements{
	public static void main(String[] args){
		
		int[] arr = {2,3,1,2,3};
		for(int i =0;i<arr.length-1;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i] ==-1){
					continue;
				}
				if(arr[i] == arr[j]){
					arr[j] =-1;
					System.out.println(arr[i] + " ");
				}
			}
		}
	}
}