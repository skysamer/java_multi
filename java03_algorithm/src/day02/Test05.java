package day02;

public class Test05 {
	static int[] num= {3, 5, 7};
	static int n=num.length;
	static boolean[] v=new boolean[n]; 

	static int count=0;
	public static void main(String[] args) {
		System.out.println("부분집합 갯수"+ (1<<num.length));
		
		f(0, 0);
		
		

	}
	
	public static void f(int idx, int cnt) {
		if(idx==n) {
			for(int i=0; i<n; i++) {
				if(v[i]==true) System.out.print(num[i]+" ");
			}
			System.out.println("원소의 개수"+cnt);
			return;
		}
		v[idx]=true;
		f(idx+1, cnt+1);
		v[idx]=false;
		f(idx+1, cnt);
	}

}
