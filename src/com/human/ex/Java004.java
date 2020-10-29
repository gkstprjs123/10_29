package com.human.ex;

import java.util.ArrayList;

public class Java004 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add("Hi");
		list.add("Hello");
		
		list.add(10);
		list.add(new Integer(10));
		
		list.add(0,"bye");
		
		for(int i=0; i<list.size(); i++) {
			Object o= list.get(i);
			System.out.println(o.toString());
		}

	}
	

}
