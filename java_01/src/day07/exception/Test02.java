package day07.exception;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			int num=9;
			if(num%2==0) throw new Exception("~~~~");
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Thread.sleep(3000);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
		
		
		
		System.out.println("end");

	}

}
