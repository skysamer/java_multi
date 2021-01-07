package day02;

public class Search {
	static int count1=0;
	static int count2=0;
	
	//o(n)
	public static int seqSearch(int[] arr, int n, int key) {
		for(int i=0; i<n; i++) {
			count1++;
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[] arr, int n, int key) {
		int start=0;
		int end=n-1;
		while(start<=end) {
			count2++;
			int center=(start+end)/2;
			if(arr[center]==key) return center;
			else if(arr[center]<key) start=center+1;
			else end=center-1;
		}
		return -1;
	}

}
