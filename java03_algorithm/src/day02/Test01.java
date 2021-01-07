package day02;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		int arr[]=new int[1000];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*1000+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int key=23;
		int idx=Search.seqSearch(arr, arr.length, key);
		
		if(idx==-1) {
			System.out.printf("%d X", key);
		}
		else {
			System.out.printf("%d는 %d%n", key, idx);
		}
		System.out.println("=====================================");
		
		
		idx=Search.binSearch(arr, arr.length, key);
		if(idx==-1) {
			System.out.printf("%d X", key);
		}
		else {
			System.out.printf("%d는 %d%n", key, idx);
		}
		System.out.println("==========================================");
		System.out.println(Search.count1);
		System.out.println(Search.count2);

	}

}
