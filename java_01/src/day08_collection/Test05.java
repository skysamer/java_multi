package day08_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {

	public static void main(String[] args) {
//		Set<String> set =new TreeSet<String>();
		Set<String> set =new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("고길동");
		if(set.add("홍길동")) {
			System.out.println("등록 o");
		}else {
			System.out.println("등록 x");
		}
		set.add("최길동");
		System.out.println(set);
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String data = it.next();
			if(data.equals("고길동")) it.remove();
			System.out.println(data);
		}
		System.out.println(set);

	}

}
