package day08_collection;

public class Test02 {
	public static void main(String[] args) {
		Employee emp1= new Employee("홍길동", 1234);
		System.out.println(emp1);
		
		Employee<String, Integer> emp2= new Employee<String, Integer>("고길동", 1234);
		System.out.println(emp2);
		
		Employee<String, Double> emp3= new Employee<String, Double>("박길동", 1234.88);
		System.out.println(emp3);
		

	}

}

class Employee<T, P extends Number>{
	T name;
	P num;
	
	public Employee() {}
	
	public Employee(T name, P num) {
		this.name = name;
		this.num = num;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public P getNum() {
		return num;
	}

	public void setNum(P num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
}