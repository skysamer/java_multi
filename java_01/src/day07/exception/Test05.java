package day07.exception;

public class Test05 {
	public static void main(String[] args) {
		
		Employee e1=null;
		try {
			e1 = new Employee("홍길동", "기술부", -29);
		} catch (Exception e3) {
			System.out.println(e3);
		}
		
		System.out.println(e1);
		
		Employee e2 =new Employee();
		
		try {
			e2.setAge(-31);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(e2);
		
		System.out.println("end");

	}

}
