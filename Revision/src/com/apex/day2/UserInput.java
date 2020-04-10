package com.apex.day2;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Select one of the option: 1) Add 2) subract 3)Multiply 4) divide");
		int operation = input.nextInt();
		switch(operation) {
		case 1:
			System.out.println("enter two numbers to calculate the sum");
			int a = input.nextInt();
			int b = input.nextInt();
			sum(a,b);
			break;
		case 2:
			System.out.println("enter two numbers to calculate the difference");
			a = input.nextInt();
			b = input.nextInt();
			difference(a,b);
			break;
		case 3:
			System.out.println("enter two numbers to calculate the product");
			a = input.nextInt();
			b = input.nextInt();
			product(a,b);
			break;
		case 4:
			System.out.println("enter two numbers to calculate the division");
			a = input.nextInt();
			b = input.nextInt();
			divide(a,b);
			break;
		default:
			System.out.println("The required functionality is not defined");
		}
		input.close();
	}
	
	public static void sum(int a, int b) {
		System.out.println((a+b));
	}
	
	public static void difference(int a, int b) {
		System.out.println((a-b));
	}
	
	public static void product(int a, int b) {
		System.out.println((a*b));
	}
	
	public static void divide(int a, int b) {
		System.out.println((a/b));
	}
	
}
	
