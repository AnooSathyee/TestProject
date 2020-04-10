package com.apex.day2;

public class Conditions {

	public static void main(String[] args) {

		int a = 10;
		int b = 11;
		int c = b;

		if(a==b && b==c) {
			System.out.println("none of the condition is satified");
		} else if(a==b || b==c){
			System.out.println("one condition is satified");
		}else {
			System.out.println("not equal");
		}do {
			System.out.println(a);
		}
		while(a>20);
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
