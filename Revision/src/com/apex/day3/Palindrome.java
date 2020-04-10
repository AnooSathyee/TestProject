package com.apex.day3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		//Palindrome Checker App
		System.out.println("Enter a string to check if it is a Palindrome >>> ");
		String originalText = console.nextLine();
		System.out.println("original text >>> " + originalText);
		String reverseText = "";
		for(int i = originalText.length(); i > 0; i--) 
		{
			reverseText += originalText.substring(i - 1, i);
		}
		System.out.println("reverse text >>> " + reverseText);
		if(originalText.equals(reverseText)){
			System.out.println(originalText + " is a palindrome!");
		} 
		else 
		{
			System.out.println(originalText + " is NOT a palindrome!");
		}
		System.out.println();
		//1 Get a value for a String variable called s from the keyboard, and 
		//(using a String class method) print the number of characters in string.  
		//This and all following problems should work for any length of String entered by the user 
		//(i.e. use a method call, rather than hard-coding the answer).
		System.out.print("Enter a word >>> ");
		String s  = console.nextLine();
		int length = s.length();
		System.out.println("Length of your word >>> " + length);
		System.out.println();

		//2 Get a new value of string from the keyboard and (using a String class method) 
		//print a version of string without the first letter.
		System.out.print("Enter a word >>> ");
		s  = console.nextLine();
		String minusOne = s.substring(1);
		System.out.println("Your word minus the first letter >>> " + minusOne);
		System.out.println();

		//3 Get a new value of string from the keyboard.  
		// Next, change the value of s such that the last letter is omitted, and print the result.
		System.out.print("Enter a word >>> ");
		s  = console.nextLine();
		length  = s.length();
		String minusLast = s.substring(0,length - 1);
		System.out.println("Your word minus the last letter >>> " + minusLast);
		System.out.println();

		//4 Get the value of two String variables, wordOne and wordTwo, from the keyboard.  
		// Print a new String in the form of short + long + short, with the shorter of the two Strings on the outside.  
		// Example:wordOne = "hi", wordTwo = "bye" >>> hibyehi
		System.out.print("Enter a word >>> ");
		String wordOne  = console.nextLine();
		System.out.print("Enter another word >>> ");
		String wordTwo  = console.nextLine();
		int lengthOne = wordOne.length();
		int lengthTwo = wordTwo.length();
		if (lengthOne > lengthTwo)
		{
			System.out.println(wordTwo + wordOne + wordTwo);
		}
		else
		{
			System.out.println(wordOne + wordTwo + wordOne);
		}
		System.out.println();

		//5 Get the value of a String variable evenString from the keyboard.  
		//It should be a String with an even number of characters.  
		// Print out the first half of the String.  
		//You can't assume that evenString will always been the same length!  
		System.out.print("Enter a word with an even amount of letters >>> ");
		String evenString  = console.nextLine();
		length = evenString.length();
		int halfLength = length / 2;
		System.out.println("The first half of your word >>> " + evenString.substring(0,halfLength));
		System.out.println();

		//6 Get the value of two String variables, a and b, from the keyboard.  
		//Print a concatenation of the two values, omitting the first character from each. 
		//Example:a = "something", b = "pluto" >>> omethingluto
		System.out.print("Enter a word >>> ");
		String a  = console.nextLine();
		System.out.print("Enter a word >>> ");
		String b  = console.nextLine();
		String aMinusOne = a.substring(1);
		String bMinusOne = b.substring(1);
		System.out.println("a = " + a + " b = " + b + " >>> " + aMinusOne + bMinusOne);
		System.out.println();

		//7 (Riddle) What is black when you buy it, red when you use it, and gray when you throw it away?
		System.out.println("Riddle: What is black when you buy it, red when you use it, and gray when you throw it away?");
		String response = console.nextLine();
		String answer = "coal";
		if(answer.equals(response))
		{
			System.out.println("You are right!");
		} else {
			System.out.println("Sorry..You're wrong..");
		}
		System.out.println();

		//8 Get a new value for a from the keyboard, 
		//and print "HAS BAD" to the console if a has the String "bad" at the beginning (starting at index 0). 
		System.out.print("Enter a word >>> ");
		a  = console.nextLine();
		String a3 = a.substring(0,3);
		if (a3.equals("bad"))
		{
			System.out.println("HAS BAD");
		}
		System.out.println();

		//9 Get a new value for b from the keyboard, and print "No way" if what the user typed in does NOT equal "way".
		System.out.print("Enter a word >>> ");
		b  = console.nextLine();
		if (!b.equals("way"))
		{
			System.out.println("No way");
		}
		System.out.println();

		//10 Get a new value for b from the keyboard, and print a version of b without the first and last characters.  
		// This should be accomplished with one substring method call.
		System.out.print("Enter a word >>> ");
		b  = console.nextLine();
		length = b.length();
		System.out.println("Your word minus the first and last letter >>> " + b.substring(1,length - 1));
		System.out.println();

		//11 Get the value of a String variable oddString from the keyboard.  
		//It should be a String with an odd number of characters.  Print out the middle 3 characters in oddString.  
		System.out.print("Enter a String with an odd number of letters >>> ");
		String oddString = console.nextLine();
		if (oddString.length() % 2 == 0)
		{
			System.out.println("ERROR");
		}
		else
		{
			int midCharStart = ((oddString.length() + 1) / 2) - 2;
			int midCharEnd = midCharStart + 3;
			System.out.println(oddString.substring(midCharStart, midCharEnd));
		}
		console.close();
	}
}