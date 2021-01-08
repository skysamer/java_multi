package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main_j1335 {
	
	static int arr[][];
	static int white=0;
	static int blue=0;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/input1.txt"));
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		arr=new int[t][t];
		
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		f(arr, 0, 0, t);
		
		System.out.println(white);
        System.out.println(blue);
		
		sc.close();
		sc=null;
	}
	
	
	static void f(int[][] arr2, int x, int y, int size) {
		int sum=0;
		
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				sum+=arr[i][j];
			}
		}
		if(sum==size*size) blue++;
		else if(sum==0) white++;
		else {
			int newsize=size/2;
			
			f(arr, x, y, newsize);
			f(arr, x, y+newsize, newsize);
			f(arr, x+newsize, y, newsize);
			f(arr, x+newsize, y+newsize, newsize);
		}
	}
}
