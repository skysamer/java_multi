package day02;

public class Test03 {

	public static void main(String[] args) {
		int num=(int)(Math.random()*100);
		System.out.println(num);
		
		System.out.println(Double.parseDouble("99")+99.99);
		
		int num1=Integer.parseInt("99");
		
		double num2= Double.parseDouble("99.99");
		
		//Integer, Character, Byte, Double, Float
		
		System.out.printf("byte: %d~%d %n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("int: %d~%d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		
		
		System.out.println('A'+"=>"+(int)'A');
		System.out.println('Z'+"=>"+(int)'Z');
		
		System.out.println('a'+"=>"+(int)'a');
		System.out.println('z'+"=>"+(int)'z');
		
		System.out.println((int)'9');
		
		// 대문자로 변환하는 알고리즘
		
		  // ch2>='0'  && ch2<='9'
		
		char ch='a';
		
		System.out.printf("%c 숫자니? %b %n", ch, ch>='0' && ch<='9');
		System.out.printf("%c 숫자니? %b %n", ch, Character.isDigit(ch));
		
		int x=9, y=11;
		System.out.printf("(x=%d, y=%d) %n", x, y);
		// 스와핑
		int temp=y;
		y=x;
		x=temp;
		System.out.printf("(x=%d, y=%d) %n", x, y);
		
		char c1='a', c2='p';
		
		
		System.out.println("  hello  java  ".trim());//"hello  java
		System.out.println("  hello  java  ".trim().length());//11
		System.out.println("  hello  java  ".trim().charAt(4));//o
		System.out.println("  hello  java  ".trim().toUpperCase());
		                                          
		
	}

}
