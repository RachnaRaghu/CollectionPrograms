package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArrayMatrix {

	public static void main(String[] args) {
	
		int[][] arrayM={{1,2,3},{4,5,6},{7,8,9}};
		 int[][] arrayR = new int[3][3];
		 for(int i=0;i<3;i++) {
			 for(int j= 0;j<3;j++) {
				 
				 arrayR[i][j]  = arrayM[j][i];
			 }
		 }
		 
		 for(int i=0;i<3;i++) {
			 for(int j= 0;j<3;j++) {
				 
				 System.out.print(arrayR[i][j]+",");
			 }
		 }
		 
		 List list = Arrays.asList(5,1,4,2,3,6,1,2);
		 List<String> list1 = Arrays.asList("123","1234");
			/*list1.add("123");
			list1.add("2348");*/
		remove("123");
		Set set = new HashSet<>(list);
		Set set1 = new TreeSet<>(list);
		Map<Integer,String> map = new HashMap<>();
		System.out.println("unique elements are "+set);//Might be sort not necessry
		System.out.println("unique elements are Tree "+set1);//surely sort
	}
	public static void remove(String ele) {
		List<Integer> list = new LinkedList();
		
		list.add(3,1);
		
		Iterator<Integer> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println("Element in LinkedList are:"+itr.next());  
		  }  
		list.remove(ele);	
		System.out.println("elements in list are:"+ list);
				
	}

}
