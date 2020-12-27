package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterChangeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//interchangeDigit();
		//numberOfOccurenece();
		printtransposeMatrix();
		
		
	}
	static void interchangeDigit() {
		int num = 986;
		int sum = 0;
		int Wnum = 0;
		while(num>0) {
			
			Wnum = num%10;
			sum = Wnum+sum*10;
			
			num = num/10;
		}
		System.out.println("======================="+sum);
		
	}
	
	static void numberOfOccurenece() {
		String str = "aaaabbbbccc";
		char strArray[] = str.toCharArray(); 
		Map<Character, Integer> map = new HashMap<>();
		for(char c: strArray){
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
				
			}
		}
		System.out.println(str+" number of occuerence of a digit"+map);
		
	}
	
	static void transpose(char A[][], char B[][]) 
    { 
        int i, j; 
        for (i = 0; i < 5; i++) 
            for (j = 0; j < 5; j++) 
                B[i][j] = A[j][i]; 
    }
	
	static void twoDArray() {
		String str = "welcome human in Corona Virus world";
		String arrayString[] = null;
		
	/*char strArr[] = str.toCharArray();
		String subString = "";
		
			subString = str+subString;
		
		System.out.println("subString is "+subString);*/
		int startIndex = 0;
		int lastIndex = 5; 
		String strArray = "";
		String arr = "";
		String blankString = str.replaceAll("\\s", "");
		System.out.println(blankString.length());
		for(int k = 0;k<str.length();k++) {
			if(lastIndex>=30) {
				break;
			}
			else {
			arr = blankString.substring(startIndex, lastIndex);
			
			strArray =  strArray+" "+arr;
			startIndex = startIndex+6;
			lastIndex = lastIndex+6;
			
			}
		
		}
		String removeFiSpace = strArray.substring(1);
		System.out.println(removeFiSpace);
		arrayString = removeFiSpace.split(" ");
		String oneDArray = Arrays.toString(arrayString);
		System.out.println("arrayString: "+oneDArray);
		String a[][] = new String[5][5];
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<1;j++) {
			
				a[i][j] = arrayString[i]; 
				//System.out.println(a[i][j]);
		
				System.out.println(a[i][j]);
				
			}
		}
		System.out.println("value is:"+a[0][1]);
		String B[][] = new String[5][5];
	      
        //transpose(a, B); 
      
        System.out.print("Result matrix is \n"); 
        for (int i = 0; i < 5; i++) 
        { 
            for (int j = 0; j < 5; j++) 
            System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 
		
		
		
	}
	
	static void printtransposeMatrix() {
		String str = "welcome human in Corona Virus world";
		String blankString = str.replaceAll("\\s", "");
		char B[][] = new char[5][5];
		int k = 0;
		 for (int i = 0; i < 5; i++) 
	        { 
	            for (int j = 0; j < 5; j++) {
	            	if(k<str.length()) {
	            B[i][j] = blankString.charAt(k);
	            k++;
	        } 
	       }
			
		}
		 
		 for (int i = 0; i < 5; i++) 
	        { 
	            for (int j = 0; j < 5; j++) {
	            System.out.print(B[i][j] + " ");	
	            }
	            System.out.print("\n");
	        }
		 
		 char A[][] = new char[5][5];
		
	      transpose(B, A);
	      System.out.print("Result matrix is \n"); 
	        for (int i = 0; i < 5; i++) 
	        { 
	            for (int j = 0; j < 5; j++) 
	            System.out.print(A[i][j] + " "); 
	            System.out.print("\n"); 
	        } 
			
	}
	
}


