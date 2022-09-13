package com.velocity.project;

import java.util.Iterator;
import java.util.LinkedList;

public class Example2 {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(20);
		al.add(30);
		al.add(10);
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
