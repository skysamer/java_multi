package day07.exception;

public class Employee {
	// 데이터+기능
	protected String name; //이름
	private String dept; //부서
	private int age; //나이
	
	public Employee() {
	}

	
	public Employee(String name, String dept, int age) throws Exception{
		super();
		this.name = name;
		this.dept = dept;
//		try {
			this.setAge(age);
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws NegativeAgeException {
		if(age<0) throw new NegativeAgeException("나이 음수 안됨");
			
		this.age = age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}


	public void print () {
		System.out.printf("[사원명:%s, 근무부서:%s, 나이:%d] %n", this.name, this.dept, this.age);
	}

}


class NegativeAgeException extends Exception{
	NegativeAgeException(String msg){
		super(msg);
	}
}




