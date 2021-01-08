package day03;

import java.util.Arrays;

import util.Sort;

public class Test03_QuickSort {
	

	public static void main(String[] args) {
		int arr[]= {3, 2, 4, 6, 9, 1, 8, 7, 5};
		
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

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
}
