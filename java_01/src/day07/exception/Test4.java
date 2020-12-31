package day07.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("start");
		
		
		
		//scanner=new Scanner(System.in);
		try(Scanner scanner=new Scanner(new File("data.txt"))) {
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}catch (FileNotFoundException e) {
			System.err.println("data.txt 파일 준비하세요");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		System.out.println("end");

	}

}
