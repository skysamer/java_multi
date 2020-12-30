package prob06_이상민;

public class Student extends Person {
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.printf("이름: %s  나이: %d  학번: %d %n", getName(), getAge(), id);
	}

}
