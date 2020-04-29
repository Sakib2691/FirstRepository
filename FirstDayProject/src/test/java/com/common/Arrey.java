package com.common;

public class Arrey {

	public static void main(String[] args) {
	int[]x= {2,55,62,9,3,87};
	int max=-1;
	for(int i=0;i<x.length;i++) {
		if(x[i]>max)
			max=x[i];
		
	}
	System.out.println(max);
	}

}
