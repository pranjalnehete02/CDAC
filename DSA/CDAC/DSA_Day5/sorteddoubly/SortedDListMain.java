package com.cdac.acts.sorteddoubly;

import com.cdac.acts.sorteddoubly.SortedDList;
import com.cdac.acts.sorteddoubly.SortedDListImplementation;

public class SortedDListMain {
	public static void main(String[] args) {
		SortedDList list = new SortedDListImplementation();
		list.insert(10);
		list.insert(80);
		list.insert(70);
		list.insert(100);
		list.insert(50);
		list.insert(80);
		list.insert(20);
		
		System.out.println("List elements: ");
		list.print();
		
		try {
		System.out.println(list.search(100));
		
		list.delete(70);
		System.out.println("Delete One element: ");
		list.print();
		list.deleteAll(80);
		System.out.println("Delete all same element: ");
		list.print();
	    }catch(IllegalStateException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
