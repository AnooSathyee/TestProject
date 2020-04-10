package com.apex.day1;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println(sum(5,10));
		System.out.println(sum(5,5,105));
		myMethod();
		System.out.println("myMethod() executed successfully!");
		Output output = new Output();
		Output.myMethod();
		System.out.println(Output.product(5, 5));
	}

	public static int sum(int a, int b) {

		// learning data types
		int c = a+b;
		//System.out.println(a + b);
		return c;
	}
	
	public static int sum(int a, int b, int c) {
		int x = (a + b + c);
		return x;
	}
	
	public static void myMethod() {
		System.out.println("Printing from inside method");
	}
}

class Output{
	
	public static void myMethod() {
		System.out.println("It's the method from output class");
	}
	
	public static int product(int a, int b) {
		int c = (a * b);
		return c;
	}
}
