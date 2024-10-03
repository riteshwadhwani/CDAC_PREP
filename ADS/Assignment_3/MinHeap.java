

class MinHeap{
	static void Heapify(int[] arr,int n ,int i){
		int smallest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		if(l<n && arr[smallest] > arr[l]){
			smallest = l;
		}
		if(r<n && arr[smallest] > arr[r]){
			smallest = r;
		}
		if(smallest != i){
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
			Heapify(arr, n , smallest);
		}
	}
	static void HeapSort(int[] arr){
		int n = arr.length;
		
		for(int i = n/2-1;i>=0;i--){
			Heapify(arr,n,i);
		}
		
		for(int i =n-1;i>=0;i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			Heapify(arr,i,0);
		}
	}
	public static void main(String[] args){
		int arr[] = {2,3,5,1,6,7};
		HeapSort(arr);
		
		for(int a : arr){
			System.out.print(a + " ");
		}
	}
}