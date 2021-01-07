package day01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	static int t, r, c;
	static char arr[][];

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input/input1.txt"));
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		t=Integer.parseInt(br.readLine());
		String[] read=br.readLine().split(" ");
		
		r=Integer.parseInt(read[0]);
		c=Integer.parseInt(read[1]);
		
		arr=new char[r][c];
		
		for(int i=0; i<r; i++) {
			String msg=br.readLine();
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
