

class MaxHeap{
	public static void Heapify(int[] arr , int n , int i){
		int largest = i;
		int l = 2 * i +1;
		int r = 2 * i + 2;
		if(l< n && arr[largest] < arr[l]){
			largest = l;
		}
		if(r < n && arr[largest] < arr[r]){
			largest = r;
		}
		if(largest != i){
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			Heapify(arr,n,largest);
		}
	}
	public static void HeapSort(int arr[]){
		int n = arr.length;
		for(int i = n/2 -1 ; i>=0;i--){
			Heapify(arr,n,i);
		}
		for(int i = n-1;i>=0;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			Heapify(arr,i,0);
		}
	}
	public static void main(String[] args){
		int arr[] = {12,7,15,5};
		HeapSort(arr);
		
		
		System.out.println("Entracted Element" + arr[arr.length-1] );
		System.out.print("Remaining Element :");
		for(int i =0;i<arr.length-1;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}