package com.yedam.java.ch13_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// 기본타입을 사용하였음. Map은 클래스만 가능...
		Map<String,Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90); // 새로운 key값이 홍길동으로 들어와서 기존의 k,v삭제
		map.put("동장군", 80);
		map.put("홍길동", 95); // key가 중복값 , 기존의 값을 덮어씀
		
		System.out.println("총 Entry 수 : "+map.size());
		System.out.println("\t 홍길동 : " +map.get("홍길동")); //홍길동 : 95
		System.out.println();
		
		Set<String> keySet = map.keySet(); //맵이 가지고 있는 key사용해서 set을 구성 // 반복자 때문에 이용
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 맵을 구성하고 있는 엔트리를 가지고 set을 구성
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry= entryIterator.next();
					String key = entry.getKey();
					int value = entry.getValue();
					
					System.out.println("\t" + key+ " : "+value);
		}
		System.out.println();

	}

}
