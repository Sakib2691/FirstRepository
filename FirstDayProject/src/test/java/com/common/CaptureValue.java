package com.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureValue {

	public static void main(String[] args) {
		String mystring="ahmedsakib12345@gmail.com";
		String emailpattern="[0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}";
		String mypattern="\\d{7}";
		Pattern pattern= Pattern.compile(emailpattern);
		Matcher m = pattern.matcher(mystring);
		while(m.find()) {
			System.out.println(m.group().trim());
		}

	}

}
