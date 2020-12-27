package com.java.practice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Interval {
	LocalTime start;
	LocalTime end;
	List<String> nameofClass;
	
	Interval(){
		
	}
	
    @Override
	public String toString() {
		return " :start=" + start + ", end=" + end + "]";
	}




	


	Interval(List<String> nameofClass2,LocalTime dateTime1, LocalTime dateTime2) 
    { 
		this.nameofClass = nameofClass2;
        this.start=dateTime1; 
        this.end=dateTime2; 
    }
	

}
