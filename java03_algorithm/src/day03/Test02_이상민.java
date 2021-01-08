package day03;

import java.util.Arrays;

public class Test02_이상민 {

	static String[] arr= {
			"static", "class", "package", "if", "void",
			"int", "byte", "long", "new", "final",
			"public", "return", "break", "continue", "else",
			"switch", "do", "while", "for", "boolean"
	};
	static int n=arr.length;

	public static void main(String[] args) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		String key="new";
		int idx=f(arr, 0, n-1, key);
		System.out.printf("%s==>%d %n", key, idx);

	}
	
	public static int f(String[] arr, int start, int end, String key) {
		if(start>end) return -1;
		
		int center=(start+end)/2;
		
		if(arr[center].compareTo(key)==0) return center;
		
		if(arr[center].compareTo(key)<0) return f(arr, center+1, end, key);  //문자열순서비교==> compareTo()
		
		else return f(arr, start, center-1, key);
	}

}
