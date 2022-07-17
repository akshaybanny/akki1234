package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo1 {
public static void main(String[] args) {
	
	ArrayList a1=new ArrayList();
	a1.add("ganesh");
	a1.add(100);
	a1.add('A');
	a1.add("ganesh");
	a1.add(65.5f);
	a1.add(null);
	a1.add(null);
	
	System.out.println(a1);
	System.out.println(a1.isEmpty());
	System.out.println(a1.contains("Akshay"));
	System.out.println(a1.contains(75.5));
	System.out.println(a1.size());
	System.out.println(a1.get(1));
	
	//add values to index shiting righ to left
	a1.add(4,500);
	System.out.println(a1);
	
	//removal of index shiting left to right 
	a1.remove(4);
	System.out.println(a1);
	//update index 3  65.5 to 75.5
	a1.set(3, 75.5);
	System.out.println(a1);
	
	
	System.out.println("==============iterator cursor==============");
	
	
	
	Iterator itr = a1.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("++++++++++++++++++++++++list iterator==============");
	
	
	ListIterator litr = a1.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	
	System.out.println("----------array list by for loop--------------");
	
	for(int i=0;i<=a1.size()-1;i++) {
		System.out.println(a1.get(i));
	}
	
	System.out.println("----------arrray list by foreach loop");
	
	for(Object s1:a1) {
		System.out.println(s1);
	}
}

}
