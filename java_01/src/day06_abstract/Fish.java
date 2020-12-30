package day06_abstract;

public class Fish extends Animal{
	String name;
	
	public Fish() {
		super();
	}
	
	
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}
	

	@Override
	public void print() {
		System.out.printf("Fish[%s : %s]%n", kind, name);
	}
	
	public static void main(String[] args) {
		Fish f= new Fish("쿠피");
		f.print();
		f.breath();
	}


	@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
		
	}
}
