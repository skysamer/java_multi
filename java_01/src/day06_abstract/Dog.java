package day06_abstract;

public class Dog extends Animal{
	String kind="강아지 종류";
	String name;
	
	

	public Dog() {
		super();
	}

	public Dog(String kind, String name) {
		super("강아지");
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기...");
		
	}
	
	@Override
	public void print() {
		System.out.printf("Dog[%s : %s : %s] %n", super.kind, this.kind, name);
	}
	
	
	
	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {   // this(), super() (x)
		Dog d1 =new Dog();
		d1.print();
		Dog d =new Dog("시츄", "캐리");
		System.out.println(d.kind);
		System.out.println(d.name);
		d.breath();
		d.print();
	}

	
	
	
}
