package day02;

public class Test04 {
	public static void main(String[] args) {
		int x = 100, y = 7;
		System.out.println(x / y);
		System.out.println(x % y);

		int num = 100;
		System.out.println(++num);
		System.out.println(num);

		String msg = "HelloJava";
		int idx = 3;

		if (msg != null && (idx >= 0 && idx < msg.length())) {
			System.out.println(msg.toUpperCase().charAt(idx));

		} else {
			System.out.println("msg가 null이거나 유효하지 않은 idx입니다.");

		}

		System.out.println(4 << 2);// 16 0000 0100 ==> 0001 0000
		System.out.println(4 >> 1);// 2 0000 0100 ==> 0000 0010
		System.out.println(4 & 1);// 0
		System.out.println(4 | 1);// 5

		int jumsu = 90;

//		jumsu > 70 ? true : false; s
		if (jumsu >= 0 && jumsu <= 100) {
			String res = jumsu > 70 ? "합격" : "재시";
			System.out.printf("취득점수: %d => %s%n ", jumsu, res);
		} else {
			System.out.println("유효하지 않은 값입니다.");
		}

		System.out.println("END");
		return; 
	}

}
