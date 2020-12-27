package com.java.practice;

public class VoterList {
	private static int voterID = 20;
	int totla;
	private static synchronized int counter() {
		return ++voterID;
	}
	public void getTotal() {
		totla = counter();
		System.out.println(totla);
	}

	public static void main(String args[]) {
		VoterList list = new VoterList();
		
		list.getTotal();
	}
}
