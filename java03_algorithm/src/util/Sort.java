package util;

public class Sort {
	
	private static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int minidx=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minidx] >arr[j]) {
					minidx=j;
				}
				
			}
			if(minidx!=i) {
				if(arr[i]>arr[minidx]) {
					swap(arr, i, minidx);
				}
			}
		}
	}
	
	//o(n2)
	public static void bubbleSort(int[] arr) {
		final int size=arr.length;
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		
	}

}


