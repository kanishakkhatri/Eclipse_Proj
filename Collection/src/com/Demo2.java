package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo2 {
	public static void main(String[] args) {
		//linked list
		// good for insert/delete application
		// bad for search application
		//Vector al = new Vector<>(); legacy class : old class : 1995 , limeted methods 
        //Stack al = new Stack<>();
		LinkedList ll=new LinkedList();
		ll.add(100);
	    ll.add(200);
	    ll.add("Abc");
	    ll.addLast("77777");
	    ll.add(3, "KK");
	    ll.add(true);
	    ll.add(new Date());
	    ll.add(600);
//	    ll.addFirst(111);
//	    ll.addLast(9999);

	    Iterator i=ll.iterator();
	    while(i.hasNext()){
	        System.out.println(i.next());
	    }
	}
}
