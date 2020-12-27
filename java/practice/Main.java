package com.java.practice;

import java.util.Arrays;

public class Main
{
       public static void main(String args[])
       {
    	   //String sentence = "Hello how are u";
    	   System.out.println(arrange());
    	   int mask = (int) (0*000F);
    	   int v = (int) (0*2222);
    	   System.out.println("value is "+(v&mask));
    	   Player p = new Player("rachna",2);
    	   Player p1 = new Player("rachna",1);
    	  System.out.println("comapre hsjfhjhj"+ compare(p,p1));
    	 
             
         
       }
       
      
    		public static int compare(Player a, Player b) {
    			int value1 = (a.name.compareTo(b.name));
    			 if(value1==0) {
    				 if(a.score==b.score){                        
    	                    return 0; 
    	                }
    	                    else if(a.score>b.score) {
    	                       return 1;
    	                    
    	                    }
    	                    else  
    	                    return -1;  
    	               }
    			 else  
    				 return a.name.compareTo(b.name);
    			 }
    	        
    	        
    	    
    	    
    	
       
       public static String  arrange() {
    	   String S = "No ;one awo would   could  disentangle, i Correctly. 1";
    	  
    	   String d = "\\W+";
    	   String str = "";
    	   String W[] = S.split(d);
    	   Arrays.sort(W, new java.util.Comparator<String>() {
    	       @Override
    	       public int compare(String s1, String s2) {
    	           // TODO: Argument validation (nullity, length)
    	           return (s1.length() - s2.length());// comparision
    	       }
    	   });
    	   for(int i=0;i<W.length;i++) {
    		   str = str+" "+W[i]; 
    		   str = str.trim();
    	       str =  str.toUpperCase().charAt(0)+str.substring(1).toLowerCase();
    	       
    	   }
    	   return str+".";        	       
       }
       
    	
}