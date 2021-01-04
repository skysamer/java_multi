package day08_collection;

public class Test01 {
	public static void main(String[] args) {
		Employee1 emp1=new Employee1("홍길동", "1234");
		System.out.println(emp1.num.getClass());
		
		Employee1<String> emp2=new Employee1("고길동", "2021");
		System.out.println(emp2.num.getClass());
		
		Employee1<Integer> emp3=new Employee1("이길동", 2021);
		System.out.println(emp3.num.getClass());

	}

}

class Employee1<T>{
	String name;
	T num;
	
	public Employee1() {}
	
	public Employee1(String name, T num) {
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
	
}