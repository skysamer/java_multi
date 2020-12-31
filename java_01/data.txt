package day07.exception;

public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("start");
		
		String msg="0";
		int num=0;
		String[] s=null;
		try {
			System.out.println("try block 1");
			num=Integer.parseInt(msg);
			s=new String[num]; 
			
			System.out.println("try block 2");
			
		}catch (NumberFormatException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
			System.err.println("정수 숫자를 입력하세요");
		}catch (NegativeArraySizeException e) {
			System.err.println("음수 안됨");
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			s=null;
			System.out.println("자원반납");
		}
		
		
		
		System.out.println(num);
		
		
		System.out.println("end");

	}

}
