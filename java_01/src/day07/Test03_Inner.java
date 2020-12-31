package day07;

public class Test03_Inner {

	public static void main(String[] args) {
		
		A a=new A();
		
		A.B b=a.new B();
		b.print();
		
		A.B b1=new A("~~~").new B();
		b1.print();

	}

}


class A{
	String name="홍길동";
	
	A(){}
	
	A(String name){
		this.name=name;
	}
	
	class B{
		void print() {
			System.out.println(name);
		}
	}
	
}



class B{
	A a;
	void print() {
		System.out.println(a.name);  // ?
	}
}






