package day02;

import javax.swing.JOptionPane;

public class Prob2_이상민 {
	public static void main(String[] args) {
		
		// Q1
		int num= Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요"));
		String name1=num > 0 ? "양수" :  (num < 0 ? "음수" : "0");
		System.out.printf("%d: %s \n", num, name1);
		
		// Q2
		char ch= JOptionPane.showInputDialog("문자를 입력하세요").charAt(0);
		char rec=ch>='A' && ch<='z' ? (char)(ch+32) : ch;
		char rec2=Character.isUpperCase(ch) ? (char)(ch+32):ch;
		System.out.printf("%c: %c \n", ch, rec);
		
		
		int x = 2;
		int y = 5;
		
		System.out.println(y >= 5 || x < 0 && x > 2);     

	

	}

}
