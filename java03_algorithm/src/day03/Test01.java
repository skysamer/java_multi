package day03;

public class Test01 {
	
	static int arr[]= {4, 6, 8, 9, 23, 56, 77, 89, 99, 122, 234, 543, 666};
	static int n=arr.length;

	public static void main(String[] args) {
		
		int key=99;
		int idx=f(arr, 0, n-1, key);
		System.out.printf("%d==>%d %n", key, idx);

	}
	
	public static int f(int[] arr, int start, int end, int key) {
		if(start>end) return -1;
		
		int center=(start+end)/2;
		
		if(arr[center]==key) return center;
		
		if(arr[center]<key) return f(arr, center+1, end, key);
		
		else return f(arr, start, center-1, key);
	}

}


