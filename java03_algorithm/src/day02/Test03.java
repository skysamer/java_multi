package day02;

public class Test03 {

	public static void main(String[] args) {
		System.out.println(sum1(5));
		System.out.println(factorial(5));
		System.out.println(gcd(24, 9));
		f(4);

	}
	
	public static int sum1(int n) {
		
		int sum=1;
		for(int i=2; i<=n; i++) {
			sum*=i;
		}
		return sum;
	}
	
	public static int factorial(int n) {//n n-1 n-2...1
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	
	public static int gcd(int x, int y) {
		if(y==0) return x;
		return gcd(y, x%y);
	}
	
	static void f(int n) {
		if(n>0) {
			f(n-1);
			System.out.println(n);
			f(n-2);
		}
	}

}
