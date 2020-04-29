package com.common;

public class Palindrome {

	public static void main(String[] args) {
		String text="racecar";
		String reverse="";
		for(int i=text.length()-1;i>=0;i--) {
			reverse=reverse+text.charAt(i);
		}
if(reverse.equals(text))
	System.out.println("Its a Palindrome");
else
	System.out.println("Its not a Plaindrome");
	}

}
