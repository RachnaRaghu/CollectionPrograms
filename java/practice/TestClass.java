package com.java.practice;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.*;
import static java.lang.Integer.*;


public class TestClass {
	static int i;
	int size = 20;
	
    public static void main(String[] args){
    	File res = new File("File.text");
    	FileWriter fw = new FileWriter(new BufferedWriter(res));
    	LocalDate ld = LocalDate.of(2015,12,12);
    	ld = ld.with(ChronoField.DAY_OF_YEAR,30);
    	long a = 88;
    	Integer b = new Integer((int)a);
    	Integer c = b+0;
    	Integer d = c;
    	System.out.println(b==c);
    	System.out.println(c==d);
    	System.out.println(MAX_VALUE);
    	Hashtable table;
    	
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
       // String str = scan.next();
        
        for(int i=0;i<=n;i++){
        String str = scan.next();
        String result = caseConversion(str);
        System.out.println(result);
       
        }
    }
    static String caseConversion(String S){
       // Write your code here
       String str = "";
       char c = S.charAt(0);
       str = str+Character.toLowerCase(c);
       for(int i=1;i<S.length();i++){
           char ch = S.charAt(i);
           if(Character.isUpperCase(ch))
           {
               str = str+"_";
               str = str+Character.toLowerCase(ch);
           }
           else
           str = str+ch;
       }
       return str;
       
       
    
    }
    
    public void area1() {
 	   System.out.println("hello");
    }
    
    
}

class b extends TestClass{
	String caseConversion() throws IOException{
		return null;
		
	}
	
	 public void area1() {
	 	   System.out.println("hello");
	    }
}