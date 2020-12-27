package com.java.practice;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Player {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		Solution s2 = new Solution();
		s.x = 0;
		s.inct();
		s2.inct();
		System.out.println(s.x+" x val is===== "+s2.x);
		
		String str = "Hel how r";
		boolean v;
		v = str.startsWith("hel");
		System.out.println(v);
		LinkedList l = new LinkedList();
		l.add(3);
		l.add(4);
		l.add(2);
		Collections.reverse(l);
		Collections.sort(l);
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
