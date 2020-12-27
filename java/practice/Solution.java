package com.java.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution implements Cloneable{
	static int x;
	void inct() {
		x++;
	}
	@Override
	protected Object clone(){
		return null;
		
	}
public static String arrange(String sentence) {
    String str = "";
    String st[] = sentence.split(" ");
        for(int i=0;i<st.length;i++){
            String temp = st[i];
            int j= i-1;
            while(j>=0&&temp.length()<st[j].length()){
                st[j+1] = st[j];
                j--; 
            }
            st[j+1] = temp;
            str = st[j+1]+str;
            
        }
        return str;

}




public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String sentence = bufferedReader.readLine();

    String result = arrange(sentence);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
}
}
