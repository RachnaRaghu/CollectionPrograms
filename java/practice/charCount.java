package com.java.practice;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class charCount {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
         */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
          
        for(int i=0;i<n;i++){
          String name = s.next();
          System.out.println(caseConvert(name));
        } 
        
        
       

    }
    public static String caseConvert(String str){
        String res = "";
        char ch = str.charAt(0);
        res = res+Character.toLowerCase(ch);
        for(int i=1;i<str.length();i++){
            char charr = str.charAt(i);

            if(Character.isUpperCase(charr)){
                res = res+'_';
                res = res+Character.toLowerCase(charr);
            }
            else 
            res = res+charr;
        }
        return res;
        
    }
}
