package day06;

public class Prob6 {
	public static void main(String[] args) {
         Person[] persons = {
        		 new Teacher("김선생", 34,"JAVA"),
        		 new Student("박학생", 15, 202001),
        		 new Employee("이사원", 55, "행정실")
         };
         
         for(Person data :persons) {
        	 data.print();
         }
	}
}

class Person{
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void print(){
	   System.out.printf("이 름 : %s   나 이 : %d  ",name,age);	
	}
}
class Student extends Person{
	int id	;
	
	public Student(String name, int age , int id) {
		super(name,age);
		this.id = id;
	}

	public void print(){
		super.print();
		System.out.printf("학      번 : %d %n",id);
	}
}
class Teacher extends Person{
	String subject ;
	
	public Teacher(String name, int age , String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	public void print(){
		super.print();
		System.out.printf("담당과목 : %s %n",subject);
	}
}
class Employee extends Person{
	String dept;
	
	
	public Employee(String name, int age ,String dept) {
		super(name,age);
		this.dept = dept;
	}


	public void print(){
		super.print();
		System.out.printf("부      서 : %s %n",dept);
	}
}