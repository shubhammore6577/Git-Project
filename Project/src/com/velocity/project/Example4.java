package com.velocity.project;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shubham");
		al.add("khushwant");
		al.add("Ganesh");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
