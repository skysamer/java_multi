package day03;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {
		int num=99;
		int i;
		for(i=0; i<10; i+=2) {
			System.out.println("Hello java "+i);
		}
		System.out.println(i);
		System.out.println("------------------------------------------");
		
		for(int count=9; count>10; count--) {
			System.out.println("html5");
		}
		
		for(int count=0; ; count++) {
			System.out.println("~~~~~");
			if(count == 4) break;
		}
		System.out.println("----------------------------------------------");
		
		i=0;
		while(i<5) {
			System.out.println("while loop "+i);
			i++;
		}
		
		String msg = "";
		boolean flag = false;
		while(!flag) {
			System.out.println("~~~~");
			msg = JOptionPane.showInputDialog("종료를 원하면 quit");
			System.out.println("입력값: "+msg);
			if(msg.equalsIgnoreCase("quit")) flag = !flag;
		}
		
		i=9;
		do {
			System.out.println("do while loop "+i);
			i++;
		}while(i<5);

	}

}
