package com.java.practice;

import java.util.HashSet;
import java.util.Set;

public class CollectionCheck {

	public static void main(String[] args) {
		

		Set<Person> set = new HashSet<Person>();
 		Person e1  =new Person("p", "er", 12);
 		
 		Person e2  =new Person("p", "er", 12);
 		set.add(e1);
 		set.add(e2); 
 		System.out.println("Size of hashSet is:" + set.size());
	}

}
