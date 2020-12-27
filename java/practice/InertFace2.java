package com.java.practice;

public interface InertFace2 {
	default void show1() {
		int c = 2+9;
		System.out.println(c);
	}
}
