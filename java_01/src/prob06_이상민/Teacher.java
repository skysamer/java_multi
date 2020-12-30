package prob06_이상민;

public class Teacher extends Person{
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	private String subject;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.printf("이름: %s  나이: %d  담당과목: %s %n", getName(), getAge(), subject);
	}
	

}
