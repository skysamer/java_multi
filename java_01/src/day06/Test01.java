package day06;

public class Test01 {
	public static void main(String[] args) {
//      is a 관계=>모든 객체의 data Type은 부모가 될 수 있다.
//		부모타입인 경우	접근 영역에 제한을 받는다. 메모리 하단부 접근 X	
//		메모리 하단부 접근하려면 다운 캐스팅 必要
//		
		
		
		Dog d1=new Dog();
		Animal d2=d1;
		
//		System.out.println(d1.kind);
//		System.out.println(d2.kind);
		
		Dog d=new Dog();
		System.out.println(d.kind);  // 강아지 종류
		System.out.println(((Animal)d).kind);  // 동물의 종류
		
		Animal dd=new Dog();
		System.out.println(dd.kind);  // 동물의 종류
		System.out.println(((Dog)d).kind);  // 강아지 종류
		
		
		Fish f=new Fish();
		System.out.println("-------------------------------------------");
		Animal a=null;
		
		a=new Fish();
		a.breath();
		((Fish)a).print();
		
		a=new Dog();
		a.breath();
		((Dog)a).print();
	}

}
