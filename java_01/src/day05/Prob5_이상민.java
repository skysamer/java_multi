package day05;

import java.util.Arrays;

public class Prob5_이상민 {
	public static void main(String args[]) {
		
		Prob5_이상민 p = new Prob5_이상민();
		
		System.out.println(p.leftPad("SDS", 6, '#') );
		System.out.println(p.leftPad("SDS", 5, '$') ); 
		System.out.println(p.leftPad("SDS", 2, '&') ); 
		
		int arr[]= {4, 2, 1, 3};
		
		Prob5_이상민.sort(arr);
	}
	
	
	public String leftPad(String str, int size, char padChar) {
		
		StringBuilder sbAdd=new StringBuilder();
		
		for(int i=str.length(); i<size; i++) {
			if((int)str.length()>=size) break;
			sbAdd.append(padChar);
		}
		
		sbAdd.append(str);
		return sbAdd.toString();
		
		
	}
	
	
	public static void sort(int[] arr) {
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
