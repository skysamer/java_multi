package prob06_이상민;

public class Prob06_이상민 {
	public static void main(String[] args) {
		
		Student s=new Student("홍길동", 20, 200201);
		Teacher t=new Teacher("이순신", 30, "JAVA");
		Employee e=new Employee("유관순", 40, "교무과");
		
		s.print();
		t.print();
		e.print();

	}

}
