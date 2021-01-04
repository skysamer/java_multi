package day08_collection;

import java.util.HashMap;
import java.util.Map;

public class Test07 {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "2222");
		map.put("java03", "1111");
		map.put("java07", "2222");
		map.put("java09", "9999");
		map.put("java11", "1111");
		
		System.out.println(map);
		
		System.out.println(map.get("java01"));

	}

}
