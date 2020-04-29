package com.common;

import java.util.regex.Pattern;

public class FindPhonenumber {

	public static void main(String[] args) {
	String num="111-111-1111";
	
	if(Pattern.matches("\\d{3}-\\d{3}-\\d{4}",num) ==true)
		System.out.println("Vaild Phone Number");
	
	
	else if(Pattern.matches("\\d{3}-\\d{2}-\\d{4}",num)==true)
		System.out.println("Its a SSN");
	
	
	else if (Pattern.matches("\\d{5}", num)==true)
		System.out.println("Its a Zipcode");
	
	
	else System.out.println("Unknown");
	}

}
	

