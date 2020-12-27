package com.java.practice;
public class Person{ 
    //declare three variables for name,city and age of a person and also a parameterized constructor for (name,city,age)
    
	String name;
	String city;
	int age;
	
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
 }