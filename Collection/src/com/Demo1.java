package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
	    // List l=new List();
	    // heterogeneous values
	    // size is not fixed
		//search application:good
		// insert delete application:bad
	    ArrayList al=new ArrayList<>(4);
	    al.add(100);
	    al.add(200);
	    al.add("Abc");
	    al.add(true);
	    al.add(new Date());
	    al.add(600);

	    Iterator i=al.iterator();
	    while(i.hasNext()){
	        System.out.println(i.next());
	    }
	    System.out.println("==================");
	    System.out.println(al.contains(100));
	    System.out.println(al.size());
	    System.out.println(al.isEmpty());
	    System.out.println(al.remove(0));
	    System.out.println(al);
//	    System.out.println(al.clear());

	}
}
