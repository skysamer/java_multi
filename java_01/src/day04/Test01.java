package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] jumsu = null;
		jumsu=new int[5];
		System.out.println(Arrays.toString(jumsu));
		
		jumsu[0]=99;
		jumsu[1]=100;
		jumsu[2]=89;
		jumsu[3]=99;
		jumsu[4]=79;
		
		int sum =0;
		for(int i=0; i<jumsu.length; i++) {
			sum+=jumsu[i];
			System.out.print(jumsu[i]+" ");
		}
		System.out.println();
		System.out.println(sum/jumsu.length);
		
		System.out.println("==================================");
		for(int data :jumsu) {
			System.out.println(data);
		}
			
		System.out.println("==================================");
		int[] num=new int[10];
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100);
		}
		
		sum=0;
		for(int data:num) {
			sum+=data;
			System.out.printf("%d ", data);
		}
		System.out.println();
		System.out.println(sum);
		

	}

}
