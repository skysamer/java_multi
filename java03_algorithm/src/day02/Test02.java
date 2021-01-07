package day02;

import java.util.Arrays;
import java.util.Stack;

public class Test02 {

	public static void main(String[] args) {
		String[] keyword= {
				"static", "class", "package", "if", "void",
				"int", "byte", "long", "new", "final",
				"public", "return", "break", "continue", "else",
				"switch", "do", "while", "for", "boolean"
		};
		
		String key="do";
		
		Arrays.sort(keyword);
		int idx=Arrays.binarySearch(keyword, key);
		
		if(idx==-1) {
			System.out.printf("%s=>java keyword 아님", key);
		}
		else {
			System.out.printf("%s=>java keyword 입니다.", key);
		}
		
		

	}

}
