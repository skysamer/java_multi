package day04;

public class Test03 {
	public static void main(String[] args) {
		int[]num1={66, 77, 33, 55, 100};  // new int[] 생략가능, 라인 분리시 추가해야됨
		int num2[]=num1;
		int[] num3=num2.clone();
		
		if(5<num1.length)num1[5]=11;
		num2[0]=22;
		num3[0]=33;
		
		
		num1=null;
		num2=null;   
		
		System.out.println("-----------------------------------------------");

		
		int[] num4={5, 9, 1, 4, 3};
		int[] num5=new int[num4.length*2];
		
		System.arraycopy(num4, 0, num5, num4.length, num4.length);
		
		for(int i=0; i<num5.length; i++) {
			System.out.printf("%d ", num5[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		String[] data="고길동/ 99/ 77/ 100".split("/");
		double sum=0;
		
		for(int i=1; i<data.length; i++) {
			sum+=Double.parseDouble(data[i].trim());
		}
		
		System.out.printf("%s: %.2f %n", data[0], sum/3);
	}

}
