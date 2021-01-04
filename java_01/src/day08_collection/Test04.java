package day08_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test04 {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
		List<String> list = new Vector<String>();
		System.out.println(list.size());
		list.add("홍길동");
		list.add("고길동");
		list.add("김길동");
		list.add("홍길동");
		list.add("박길동");
		list.add("초길동");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"  ");
		}
		
		System.out.println("\n이길동 ?"+list.contains("이길동"));
		if(!list.contains("이길동"))
			list.add(1, "이길동");
		for(String data:list) {
			System.out.println(data.charAt(0)+"**");
		}
		System.out.println("===Iterator 기반 순회===");
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String data = it.next();
			if(data.equals("고길동")) it.remove();
			System.out.println(data);
			
		}
		
		System.out.println(list);
		

	}

}
