package com.java.practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Scooer {
	
	public static int mergeIntervals(List<String> name,Interval[] class1,int n) {
		
		
		
		Arrays.sort(class1,new Comparator<Interval>(){ 
            public int compare(Interval intr1,Interval intr2) 
            { 
                return intr1.start.compareTo(intr2.end); 
            } 
        }); 
		
		 int index = 0;  
		 int count = 1;
	        for (int i=1; i<class1.length; i++)  
	        {  
	           
	        	
	        		if(class1[index].end.isAfter(class1[i].start)) 
	            {  
	                 if(class1[index].end.isAfter(class1[i].end)) {
	                	 class1[index].end = class1[index].end;
	                	
	                	 
	                 }
	                 else {
	                	 class1[index].end = class1[i].end; 
	                	
	                 }
	                 if(class1[i].start.isAfter(class1[index].start)) {
	                	 class1[index].start =  class1[i].start;
	                
	                 }
	                 else {
	                	 class1[index].start = class1[index].start;
	                	 
	                 }
	                  
	            }  
	            else { 
	                index++; 
	                class1[index] = class1[i];  
	                ++count;
	               
	               
	            } 
	        		
	        		
	        }
			return count; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<List<String>, Object> map = new HashMap<>();
		int m = sc.nextInt();
		
		List<String> nameofClass = new ArrayList<>();
		
		LocalTime dateTime1 = null;
		LocalTime dateTime2 = null;
		
		
		
		for(int j=0;j<m;j++) {
			int n = sc.nextInt();
			Interval arr[]=new Interval[n]; 
		for(int i=0;i<n;i++) {
			nameofClass.add(sc.next());
			dateTime1 = LocalTime.parse(sc.next()+"0");
			dateTime2 = LocalTime.parse(sc.next()); 
			arr[i]=new Interval(nameofClass,dateTime1,dateTime2); 
			
			
		}		
				
        System.out.println(mergeIntervals(nameofClass,arr,n)); 
		}
        
	}
	
}
