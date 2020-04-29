package com.common;

public class Sum20 {

	public static void main(String[] args) {
	
		int[]x= {5,7,10,13,8,6};
		for (int i=0; i<x.length;i++) {
			
		
int V1=x[i];
for(int j=i+1;j<x.length;j++) {
	int V2=x[j];
	if (V1+V2>=20)
	
		System.out.println(x[i]+ ","+x[j]);
	
}
	
}

	}

}
