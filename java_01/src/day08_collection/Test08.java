package day08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class Test08 {

	public static void main(String[] args) {
		
		String[] s1= {"홍길동", "김길동", "이길동", "고길동"};
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
		
		Arrays.sort(s1, new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b)*-1;
			}
		});
		System.out.println(Arrays.toString(s1));
		
		Arrays.sort(s1, (a,b) ->{return a.compareTo(b)*-1;});
		System.out.println(Arrays.toString(s1));
		
		
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("고길동");
		list.add("김길동");
		list.add("홍길동");
		list.add("박길동");
		list.add("초길동");
		
		Collections.sort(list);
		
		for(String data:list) {
			System.out.println(data);
		}
		System.out.println("-------------------");
		list.forEach(i->System.out.println(i));

	}

}
