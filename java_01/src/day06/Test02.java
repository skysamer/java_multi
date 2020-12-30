package day06;

public class Test02 {
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.breath();
		
		Fish f=new Fish();
		f.breath();
		
		System.out.println("==================================");
		
		
		
		breathCall(d);
		breathCall(f);
		
	}	
	
	public static void breathCall(Animal a) { // 다형성
		a.breath();
	}

}
