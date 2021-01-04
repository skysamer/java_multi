package day08_collection;

import java.util.Stack;

public class Test03 {

	public static void main(String[] args) {
		Stack<String> s1=new Stack<String>();  // String[]
		s1.push("홍길동");
		s1.push("고길동");
		System.out.println(s1.pop().charAt(0)+"**");
		
		
		Stack<Integer> s2=new Stack<Integer>();// Integer[]
		s2.push(1);
		System.out.println(s2.pop()*11);
		
		Stack s3=new Stack(); // Object[]
		s3.push("홍길동");
		s3.push("고길동");
		
		if(s3.pop() instanceof String)
		System.out.println(((String)s3.pop()).charAt(0)+"**");
	}

}
