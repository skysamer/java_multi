package day03;

public class personal_check01 {

	public static void main(String[] args) {
		int sum = 0; 
		int sum2 = 0;
		
		int i=1;
		
		for(i=1; i<=10; i++) {
			sum+=i;
			sum2+=sum;
		}
			
		System.out.println(sum);  

	}

}
