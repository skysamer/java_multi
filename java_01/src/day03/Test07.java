package day03;

public class Test07 {
	public static void main(String[] args) {
		
		String msg = "hello"+", "+"java"+1+", "+"Spring";  // X
		System.out.println(msg);
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(", ");
		sb.append("java");
		sb.append(1);
		sb.append(", ");
		sb.append("Spring");
		
		String result = sb.toString(); 
		System.out.println(result);

	}

}
