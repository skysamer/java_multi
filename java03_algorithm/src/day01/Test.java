package day01;

import java.util.Scanner;

public class Test {
	
	static int[] nan;
	static int[] temp;
	static int sum;
	
	public static void main(String args[]) {
		
	// 백설공주 중 7난장이의 합이 100이면 통과
	Scanner scan = new Scanner(System.in);
		
	// 배열은 선언 후 초기화 필요!!
	nan=new int[10];
	temp=new int[10];
	for(int i=0;i<9;i++) {
		nan[i] = scan.nextInt();
	}
		
	for(int i=0;i<(1<<9);i++) { // 경우의 수 
		// 2명을 제외하고 더한 값이 100 이 나올 때 ! 
		// 10명 중 2명 고르기
		if(count(i)==7) {
			int idx=0;
			sum=0;
			for(int j=0;j<9;j++) { // 부분집합 모든 경우의 수 출력! 
				if((i&(1<<j))!=0) { // 1일 때 선택한다.  
					sum+=nan[j];
					temp[idx++]=nan[j];
				}
			}
			if(sum==100)
				break;
		}
	}
		//System.out.println(Arrays.toString(temp));
		//한줄씩 출력 
	for(int j=0;j<7;j++) 
		System.out.println(temp[j]);
	}

	static int count(int v) {
		int count =0;
		while(v>0) {
			if((v&1)==1) // 끝자리가 1이면 카운트
				count++;
			v=v>>1;//오른쪽으로 1칸 shift!
		}
		return count;
	}

}
