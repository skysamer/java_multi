package util;

public class Sort {
	
	static int[] temp=null;
	
	public static void swap(int arr[], int i, int j) {
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
	
	public static void quickSort(int arr[], int begin, int end) {
		if(begin<end) {
			int p=begin;
			int i=begin+1;
			int j=end;
			
			while(i<=j) {
				while(i<arr.length&&arr[i]<=arr[p])i++;
				while(j>=0&&arr[j]>arr[p])j--;
				if(i<j) Sort.swap(arr, i, j);
			}
			Sort.swap(arr, p, j);
			
			quickSort(arr, begin, j-1);
			quickSort(arr, j+1, end);
		}
		
	}
	
	public static void merge(int arr[], int begin, int end) {
		if(begin>=end) return;
		
		int mid=(begin+end)/2;
		
		merge(arr, begin, mid);
		merge(arr, mid+1, end);
		
		// merge 작업
		
		for(int i=begin; i<=end; i++) {
			temp[i]=arr[i];
		}
		
		int i=begin, j=mid+1, k=begin;
		// 앞배열    //뒷배열   //통합배열arr
		
		while(i<=mid&&j<=end) {
			arr[k++]=temp[i] <temp[j] ? temp[i++] : temp[j++];
		}
		while(i<=mid) arr[k++]=temp[i++];
		while(j<=end) arr[k++]=temp[j++];
	}

}


