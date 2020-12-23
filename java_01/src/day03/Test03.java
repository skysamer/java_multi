package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		String input= "1";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("층수 입력:");
		input = scanner.nextLine();
		
		switch(input) {
		case "1":
			System.out.println("1층 약국");
			break;
		case "2":
			System.out.println("2층 피부과");
			break;
		case "3":
			System.out.println("3층 내과");
			break;
		case "4":
			System.out.println("4층 스포츠센터");
			break;
		default:
			System.out.println("존재하지 않는 층 입니다.");
		}
		

	}

}
