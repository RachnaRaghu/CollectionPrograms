package com.java.practice;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimePatternJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "..." + mm + "..." + yy);
		System.out.printf("\n%d-%d-%d", dd, mm, yy);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		 int m = time.getMinute();
	int s = time.getSecond();
	 int n = time.getNano();
	 System.out.printf("\n%d:%d:%d:%d",h,m,s,n); 
	}

}

@FunctionalInterface 
interface A {
	public void methodOne();
	public default int m2() {
		return 0;
		
	}
} 
