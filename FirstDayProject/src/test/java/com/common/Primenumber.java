package com.common;

public class Primenumber {

	public static void main(String[] args) {
		int num = 9;

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				isPrime = false;
				break;
			} // end if
		} // end for

		if (isPrime == true)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime");

	}

}
