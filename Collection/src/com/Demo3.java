// hashset 
package com;

import java.util.*;

public class Demo3 {
	public static void main(String[] args) {
		// list will allow duplicates
		// ArrayList al=new ArrayList<>();
		// LinkedList ll=new LinkedList();
		// Vector al = new Vector<>(); legacy class : old class : 1995 , limeted methods 
        // Stack al = new Stack<>();
		
		// set
		// HashSet al=new HashSet<>();// no duplicate but different order
		// LinkedHashSet al=new LinkedHashSet<>();// no duplicate, user entered order print
	    TreeSet al=new TreeSet<>();// no duplicate, sorted order print
		al.add(100);	    
	    al.add(100);
	    al.add(200);
	    al.add(200);
	    al.add(700);
	    al.add(450);
	    al.add(987);
	    al.add(600);

	    Iterator i=al.iterator();
	    while(i.hasNext()){
	        System.out.println(i.next());
	    }

	}
}

