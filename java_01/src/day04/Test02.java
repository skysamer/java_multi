package day04;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int [] num={5, 9, 3, 7, 11, 45, 23};
		System.out.println(Arrays.toString(num));
		
		String[] names=new String[] {"홍길동", "고길동", "김길동", "박아무개", "훠훠"};
		System.out.println(Arrays.toString(names));
		
		// num 배열에서 50번찾기
		for(int i=0; i<num.length; i++) {
			if(num[i]==7) {
				System.out.printf("%d 위치 O %n", i);
				break;
			}
			System.out.println("X");	
		}
		
		// names 배열에서 이름이 2글자인 사람만 출력
		for(int i=0; i<names.length; i++) {
			if(names[i].length()==2) {
				System.out.println(names[i]);
			}
		}
		System.out.println("===========================================");
		
		for(String data:names) {
			System.out.printf("%s, %c** %n", data, data.charAt(0));
		}
		
		System.out.println("===========================================");
		
		char[] ch="hello java ~~~ ".toCharArray();
		boolean[] flag=new boolean[5];
		
		System.out.println("===========================================");


	}

}
