package day01;


// 1810: 백설공주(snow white)
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main_j1810 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input/input1.txt"));
		Scanner sc=new Scanner(System.in);
		
		int[] c=new int[9];
		System.out.println("총 부분집합 수"+(1<<c.length));
		System.out.println("7난장이 경우의수"+(1<<7));
		for(int i=0; i<c.length; i++) {
			c[i]=sc.nextInt();
		}
		
		print(c, c.length).
		forEach(i->System.out.println(i));
		sc.close();
		sc=null;
	}
	
	public static List<Integer> print(int[] arr, int n)
	{
		List<Integer> list=null;
		for(int i=0; i<(1<<n); i++) {
			list=new ArrayList<Integer>();
			int sum=0;
			if(count(i)==7) {
				for(int j=0; j<n; j++) {
					if((i&(1<<j)) !=0) {
						sum+=arr[j];
						list.add(arr[j]);
					}
					if(sum==100) {
						return list;
					}
				}
			}
		}
		return list;
	}
	
	public static int count(int n) {
		int count =0;
		while(n>0) {
			if((n&1)==1) count++;
			n=n>>1;
		}
		return count;
	}
}
