package util;

public class Calc {
	// +, -, *, /
	// 두 수를 더하는 add함수 정의  // static 영역에서는 this 사용 x
	static double pi=3.14;
	public static int add(int ... a) {
		int sum=0;
		for(int data:a) {
			sum+=data;
		}
		return sum;
	}
	
	
	
	
	
	public static double add(int a, double b) {
		return a+b;
	}
	
	public static double add(double a, double b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int multi(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		if(b!=0) return a/b;
		else return 0;
	}

}
