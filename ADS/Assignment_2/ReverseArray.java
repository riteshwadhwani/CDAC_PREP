

class ReverseArray{
	    static void reversArray(int[] arr, int[] ans,int i,int j){
			if(i==arr.length){
				return;
			}
			int a = arr[i];
			reversArray(arr,ans,i+1,j);
			ans[j++] =a;
		}
		public static void main(String[] args){
				int[] arr = {1,2,3,4,5};
				int[] ans = new int[arr.length];
				int i =0;
				reversArray(arr,ans,i,0);
				
				for(int a : ans){
					System.out.print(a+ " ");
				}
		}
} 