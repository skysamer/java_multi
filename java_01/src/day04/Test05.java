package day04;

public class Test05 {
	public static void main(String[] args) {
		int[] num1= {1, 1, 1};
		int[] num2= {2, 2, 2, 2, 2};
		int[] num3= {3};
		
		int[][] two= {num1, num2, num3};
		
		for(int row=0; row<two.length; row++) {
			for(int col=0; col<two[row].length; col++) {
				System.out.printf("%d ", two[row][col]);
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("=====================");
		int N=7;
		int[][] two1=new int[N][N];
		two1[2][3]=99;
		
		System.out.println("=====================");
		
		int[][] two2= {
				{},
				{90, 40, 88, 99, 89},
				{33, 99, 44, 77, 88, 67, 89},
				{99, 88, 100}
		};
		
		int sum=0;
		for(int i=1; i<two2.length; i++) {
			for(int j=0; j<two2[i].length; j++) {
				sum+=two2[i][j];
			}
			int count=two2[i].length;
			System.out.printf("%d반 평균: %.2f 인원수: %d%n",i, (double)sum/count, count);
			sum=0;
		}
	}

}
