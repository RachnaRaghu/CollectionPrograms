package com.java.practice;

public interface InertFace1 {
	default void show1() {
		int c = 2+9;
		System.out.println(c);
	}

}
