package day02;

public class Test05 {
	public static void main(String[] args) {
		// 기본형 비교: ==  ,  참조형 비교: equals()
		
		int x=99, y=98;
		System.out.printf("%d==%d ? %b %n", x, y, x==y);
		
		String s1=new String("ABC");
		String s2=new String("ABC");
		System.out.printf("%s==%s ? %b %n", s1, s2, s1==s2);    //참조형 비교: equals()
		System.out.printf("%s equals() %s ? %b %n", s1, s2, s1.equals(s2));    
		
		System.out.println("=======================================================================");
		
		
		String s3="java";
		String s4="java";
		String s5="sql";
		System.out.printf("%s==%s ? %b %n", s3, s4, s3==s4);    
		System.out.printf("%s equals() %s ? %b %n", s3, s4, s3.equals(s4)); 
		
		

	}

}
