package com.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class LoopArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(4);
		alist.add(5);
		
		System.out.println("----for loop----");
		
		for (int i=0; i<alist.size();i++) {
		System.out.println(alist.get(i));
		}		
		System.out.println("----advanced for loop----");
		
		for(int i:alist) {
			System.out.println(i);
		}
		
		System.out.println("----while loop----");
		
	int i=0;
		while(alist.size()>i) {
			
			System.out.println(alist.get(i));
		i++;
		}
		System.out.println(i);
	
		System.out.println("-----Iterating-----");
		
	    Iterator it=alist.iterator();
	    
	    while(it.hasNext()) {
	    	
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("----do while------");
	    
	    int a=0;
        do {
	    	System.out.println(alist.get(a));
	    	a++;
	}
	       while(alist.size()>a);
  }  
}
