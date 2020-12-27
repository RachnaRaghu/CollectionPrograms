package com.java.practice;

public class PatternFound {

	public static void main(String[] args) {
		System.out.println(detectCapital());

	}
	// TODO Auto-generated method stub

	public static boolean detectCapital() {
		String str = "gSogle";
		int count = 0;

		for (char arr : str.toCharArray()) {
			if ('Z' - arr >= 0)
				count++;
			System.out.println("count is " + count);

			System.out.println('Z' - arr);
		}
			return (count == 0 || count == str.length() || (count == 1 && 'Z'-str.charAt(0) >=0));

	}

}
