package com.velocity.project;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("shubham");
		al.add("Abhishek");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		

	}

}
