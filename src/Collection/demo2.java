package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class demo2 {
	
	public static void main(String[] args) {
		

		Vector V = new Vector(); //by default capacity =10
		V.add("ganesh");
		V.add(100);
		V.add('A');
		V.add(65.5f);
		V.add("ganesh");
		V.add(null);
		V.add(null);
		
		
		System.out.println(V);
		System.out.println(V.size());
		System.out.println(V.isEmpty());
		System.out.println(V.contains("rahul"));
		System.out.println(V.get(3));
		System.out.println(V.contains("Akshay"));
		
		
		
		//add
		V.add(4,500);
		System.out.println(V);
		//remove
		V.remove(4);
		System.out.println(V);
		
		//update
		
		V.set(1, 1000);
		System.out.println(V);
		
		
		
		System.out.println("==============iterator cursor for Vector=============");
		
		
		
		Iterator itr = V.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	System.out.println("-------------------list iterator for Vector-----------------");
	ListIterator litr=V.listIterator();
	
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	
	
	System.out.println("------------------using -for  loop Vector-----------------");
	
	
	for(int i=0;i<=V.size()-1;i++) {
		System.out.println(V.get(i));
	}
	
	
	System.out.println("------------for each loop----------");
	for(Object s2:V) {
		System.out.println(s2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}}
