package day01;

public class Test02 {
	public static void main(String[] args) {
		for(int i=0; i<(1<<9); i++) {
			print(i);
			count(i);
			System.out.println("==>"+count(i));
			System.out.println();
		}

	}
	
	public static void print(int num) {
		for(int i=7; i>=0; --i) {
			if((num&(1<<i))!=0) {
				System.out.printf("1");
			}
			else {
				System.out.printf("0");
			}
			
		}
	}
	// 부분집합 원소개수 카운팅
	public static int count(int v) {
		int count =0;
		while(v>0) {
			if((v&1)==1) count++;
			v=v>>1;
		}
		return count;
	}


}
