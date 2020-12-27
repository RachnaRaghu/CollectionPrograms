package com.java.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("=====diffinTwoDate===");
		diffinTwoDate("1990-08-12","1990-04-28");

 //int n = Integer.parseInt(args[1]);
		int n = 2020;
 Year y = Year.of(n); 
 if(y.isLeap())
	System.out.printf("%d is Leap year",n);
else
	System.out.printf("%d is not Leap year ",n);
 
 for(int i=0,j=0;i<7&&j<7;i++,j++) {
	 
	  System.out.println(" no of iterations"+j);
	 
		  
 }
 
 int arr[] = {1,0,1,0,1};
 int count =0;
 Arrays.sort(arr);

 System.out.print(Arrays.toString(arr));
 
 for(int k=0;k<5;k++)
 {
	if(arr[k]==0)
		count++;
 }
 for(int i=0;i<5;i++) {
	 
	if(i<count) {
		arr[i]=0;
	}
	else {
		arr[i]=1;
	}
	System.out.print("\n"+"value in array is "+arr[i]+",");
	 
 }

 
 int j=-1;
 for(int i=0;i<5;i++) {
	 if(arr[i]<1) {
		 j++;
		 int temp = arr[j];
		 arr[j] = arr[i];
		 arr[i] = temp;
	 }
 }
 System.out.println("Sorting approach ");
 for(int i=0;i<5;i++) {
	 System.out.print(arr[i]+"/");
 }
 
 
}
	
	
	public static long diffinTwoDate(String d1, String d2) {
		//SimpleDateFormat format = new SimpleDateFormat();
		LocalDate date1 = LocalDate.parse(d1);
		LocalDate date2 = LocalDate.parse(d2);
		long noOfDaysBetween = ChronoUnit.DAYS.between(date2, date1);
		System.out.println(noOfDaysBetween);
		return noOfDaysBetween;
		
	}
	
	
}
