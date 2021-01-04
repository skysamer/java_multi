package day07;

import java.util.Stack;

public class StackTest_이상민 {
	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack<Integer>();
		
		MyStack stack = new MyStack(10);
		
		if(stack.isEmpty()){
		System.out.println("스택이 비어있습니다.");
		}
		try {
		for (int i = 1; i <= 10; i++) {
		stack.push(i);
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(stack.isFull()){
		System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.peak());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");		System.out.println("== 스택 리스트 ==");
		
		for (int i = 1; i <= 10; i++) {
		int num = stack.pop();
		if(num != -1)
		System.out.println(num);
		}
	}
}


class MyStack{
	
	private int size;
	private int top;
	private int stackArr[];
	
	StackTest_이상민 test= new StackTest_이상민();
	
	public MyStack(int size) {
		top=0;
		int stackArr[]=new int[size];
		this.size = size;
		if(size<0)
			size=10;
	}

	public void push(int size) throws Exception {// 저장소
		if(!isFull())
			stackArr[top++]=size;
			
	}
	
	public boolean isEmpty() {// 빈 곳 확인
		return top==-1 ? true : false;
	}
	
	public boolean isFull() {// 풀방 확인
		return top+1==size ? true : false;
	}
	
	public int peak() {// 최상위 숫자
		return top;
	}
	
	public int pop() {// 최상위 숫자 추출
		size-=1;
		return top;
		
	}
}

