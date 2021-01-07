package day01;

public class Ex05 {

	public static void main(String[] args) {
		
		char arr[][]=new char[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<=i;j++) {
				arr[i][j]='*';
			}
		}	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
		System.out.println();
		}

	}

}
