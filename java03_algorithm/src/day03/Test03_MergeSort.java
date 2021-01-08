package day03;

import java.util.Arrays;

public class Test03_MergeSort {
	
	static int[] temp=null;

	public static void main(String[] args) {
		int arr[]= {69, 10, 30, 2, 16, 8, 31, 22};
		
		
		temp=new int[arr.length];
		merge(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

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
