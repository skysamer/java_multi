package day01;

public class Test03 {
	public static void main(String[] args) {
		char[] c= {'A', 'B', 'C', 'D'}; //1<<4 ==>2의 4승==> 16
		
		print(c, c.length);

	}
	
	public static void print(char[] c, int n) {
		for(int i=0; i<(1<<n); i++) {
			if(count(i)==2) {
			System.out.print("{ ");
			for(int j=0; j<n; j++) {
				if((i&(1<<j))!=0) System.out.printf("%c ", c[j]);
			}
			
			System.out.println("}");
			}
		}
	}
	
	public static int count(int v) {
		int count =0;
		while(v>0) {
			if((v&1)==1) count++;
			v=v>>1;
		}
		
		return count;
		
	}

}
