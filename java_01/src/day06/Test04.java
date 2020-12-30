package day06;

public class Test04 {
	public static void main(String[] args) {
		
		String s1= new String("홍길동");
		String s2=new String("홍길동");
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		
		Animal a1= new Animal("고양이");
		Animal a2 =new Animal("고양이");
		System.out.println(a1.toString());
		System.out.println(a2);
		System.out.println(a1.equals(a2));
		
		

	}

}
