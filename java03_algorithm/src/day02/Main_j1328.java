package day02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_j1328 {

	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input/input1.txt"));
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		
		int arr[]=new int[t];
		
		for(int i=0; i<t; i++) {
			arr[i]=Integer.parseInt(br.readLine().trim());
		}
		
		StringBuilder sb=new StringBuilder();
		
		A: for(int i=0; i<t; i++) {
			for(int j=i+1; j<t; j++) {
				if(i<j&&arr[i]<arr[j]) {
					sb.append(j+1).append("\n");
					continue A;
				}
			}
			sb.append(0).append("\n");
		}
		System.out.println(sb.toString());
		
	}

}
