package com;

import java.util.*;

public class Demo4 {
	// list + set=map
	// hashmap
	public static void main(String args[]) {
		//LinkedHashMap map=new LinkedHashMap<>();//no duplicate + user entered order
		//HashMap map=new HashMap<>();//reverse order of entering
		TreeMap map=new TreeMap<>();//sorted order

		map.put(111, "Suresh");
		map.put(555, "Ramesh");
		map.put(666, "Abi");
		map.put(234, "Chandan");
		map.put(777, "Pratha");
		map.put(666, "Manvit");
		
		Set s=map.entrySet();
		
		Iterator i=s.iterator();
	    while(i.hasNext()){
	        System.out.println(i.next());
	    }
		
	}
}
