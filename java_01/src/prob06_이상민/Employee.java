package prob06_이상민;

public class Employee extends Person{
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	private String dept;

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.printf("이름: %s  나이: %d  부서: %s %n", getName(), getAge(), dept);
	}

}
