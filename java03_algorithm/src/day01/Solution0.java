package day01;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution0 {
	static int t, r, c;
	static char arr[][];

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input/input1.txt"));
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		r=sc.nextInt();
		c=sc.nextInt();
		sc.nextLine();
		
		arr=new char[r][c];
		
		for(int i=0; i<r; i++) {
			String msg=sc.nextLine();
			for(int j=0; j<msg.length(); j++) {
				arr[i][j]=msg.charAt(j);
			}
		}
		System.out.printf("%d %n%d %d %n", t, r, c);
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.printf("%c", arr[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
