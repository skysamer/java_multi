package day03;

public class Test06 {
	public static void main(String[] args) {
		
		int i=0, j=0;
		
	OUT:for(i=1; i<10; i++) {
			for(j=2; j<10; j++) {
//				if(j==5) break;
//				if(j==5) continue;
				if(j==5) break OUT;
				
				System.out.printf("%d * %d =%2d | ", j, i, i*j);
			}
			System.out.println();
		}

	}

}
