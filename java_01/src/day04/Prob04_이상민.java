package day04;

public class Prob04_이상민 {
	public static void main(String[] args) {
		String strData[]={ "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		
		for(int i=0; i<strData.length; i++) {
			for(int j=(strData[i].length()-1); j>=0; j--) {
				System.out.printf("%c", strData[i].charAt(j));
			}
			System.out.println();
		}
		int i;
		int sum=0;
		for(i=1; ; i++) {
			int t=i%2==0 ? i*(-1) : i;
			sum+=t;
			if(sum>=100)
				break;
		}
		
		System.out.println(sum);
	}

}
