package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main_j1810f {
	static int[] c=new int[9];
	static int n=c.length;
	static int[] v=new int[n];

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input/input1.txt"));
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<c.length; i++) {
			c[i]=sc.nextInt();
		}
		
		f(0, 0).forEach(i->System.out.println(i));
		
		sc.close();
		sc=null;
	}

	public static List<Integer> f(int idx, int cnt) {
		List<Integer> list=null;
		if(idx==n) {
			int sum=0;
			for(int i=0; i<n; i++) {
				if(v[i]==1&&cnt==7) {
					sum+=c[i];
					list.add(c[i]);
				}
				if(sum==100) {
					return list;
				}
			}
			return list;
		}
		v[idx]=1;
		f(idx+1, cnt+1);
		v[idx]=0;
		f(idx+1, cnt);
	}
}






