package com.java.competetive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fallabela1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************");
		List<Integer> l = new ArrayList<>();
		//l.add(3,1);
		System.out.println(l); //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 0
		
		System.out.println("****************************");
		Map<String, Integer> map= new HashMap<>();
		map.put("a", 1);
		Collections.unmodifiableMap(map);
		map.put("b", 2);
		System.out.println(map);
		
		System.out.println("****************************");
		String a= "am";
		String b= new String(a);
		if(a==b)
			System.out.println("equal====");
		else
			System.out.println("NOT equal====");
	}

}
