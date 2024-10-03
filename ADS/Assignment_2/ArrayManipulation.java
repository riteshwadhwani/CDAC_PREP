import java.lang.Integer;

class ArrayManipulation{
	public static void main(String[] args){
		int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
	int n = 5;
	int [] arr = new int[5];
	
	for(int[] a : queries){
		int one = a[0]-1;
		int two = a[1]-1;
		int three = a[2];
		for(int i =one;i<=two;i++){
				arr[i] +=three;
		}
	}
	int maxi = Integer.MIN_VALUE;
	for(int a : arr){
		if(a>maxi){
			maxi = a;
		}
	}
	System.out.println("Ans : " + maxi);
	}
}