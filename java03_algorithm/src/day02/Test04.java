package day02;

public class Test04 {

	public static void main(String[] args) {
		f(4);

	}
	
	static void f(int n) {
		if(n>0) {
			f(n-1);
			System.out.println(n);
			f(n-2);
		}
	}

}
