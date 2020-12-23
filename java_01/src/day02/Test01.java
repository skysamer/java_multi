package day02;

import java.util.Date;

// import java.sql.Date (x)

public class Test01 {
	// 클래스의 구성요소
	// 변수(멤버 변수)+기능(method)
	
	int num;
	String name;
	
	public static void main(String[] args) {
		// 변수, 지역 변수, 초기화 필수
		
		// 기본형
		int num=0;
		num=99;
		System.out.println(num);
		
		
		// String은 참조형이지만 세미 타입으로 기본형 처럼 사용 가능
		java.lang.String name1=null;
		String name2=null;
		
		name1=new String("홍길동"); // X    heap 
		name2="고길동";             // O    코드표 사용
		
		System.out.println(name1);
		System.out.println(name2);
		
		name1=null;
		
		// 참조형
		Date now=new Date();
		Date now1=new Date();
		
		System.out.println(now);
		
		java.sql.Date now2=new java.sql.Date(System.currentTimeMillis());
		System.out.println(now2);
		
		
	}

}
