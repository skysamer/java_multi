package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_j1810f {
	static int[] c=new int[9];
	static int n=c.length;
	static boolean[] v=new boolean[9];

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input/input1.txt"));
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<n; i++) {
			c[i]=sc.nextInt();
		}
		
		f(0, 0, 0);
		
		sc.close();
		sc=null;
	}

	public static void f(int idx, int cnt, int sum) {
		if(sum>100) return;
		if(cnt==7 && sum==100) {
			for(int i=0; i<n; i++) {
				if(v[i]) System.out.println(c[i]);
			}
			return;
			//System.exit(0);  //App 종료
		}
		if(cnt==7||idx==9) return;
	
		v[idx]=true;
		f(idx+1, cnt+1, sum+c[idx]);
		
		v[idx]=false;
		f(idx+1, cnt, sum);
	}
	
		
}






