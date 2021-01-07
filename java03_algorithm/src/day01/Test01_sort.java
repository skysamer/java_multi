package day01;

import java.util.Arrays;

import util.Sort;

public class Test01_sort {

	public static void main(String[] args) {
		int[] arr= new int[100];
		long start=0;
		long end=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10000+1);
		}
		
		System.out.println(Arrays.toString(arr));
		//Sort.selectionSort(arr);
		//Arrays.sort(arr);
		
		Sort.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
//		System.out.printf("selectionSort: %d ms %n", end-start);
//		System.out.printf("Quick Sort: %d ms %n", end-start);
		
		
		

	}

}
