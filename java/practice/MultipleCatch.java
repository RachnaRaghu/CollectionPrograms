package com.java.practice;

import org.apache.camel.json.simple.JSONValue;
import org.json.JSONObject;

public class MultipleCatch {
	
	public static void main(String args[]) {
		
		try 
		{
		    String str = null;
		    System.out.println("1");
		    try
		    {
		        System.out.println(str.length());
		    }
		    catch (NullPointerException e) 
		    {
		        System.out.println("inner");
		    }
		    
		    System.out.println("2");
		}
		catch (NullPointerException e) 
		{
		    System.out.println("outer");
		}
		}

}
