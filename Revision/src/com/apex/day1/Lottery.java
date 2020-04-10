package com.apex.day1;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		/*
		 * Write a program that randomly generates a lottery of a 2 digit number,
		 * prompts the user to enter a 2 digit number, and determines whether the user 
		 * wins according to the following rule:
		 * --> If the user input matches the lottery in exact order, the award is $10,000
		 * --> If the user input matches the lottery the award is $3000
		 * --> If the user input matches a digit in the lottery, the award is $1000
		 */

		Random random = new Random();
		int lottery = random.nextInt(90) + 10;
		System.out.println(lottery);

		// https://stackoverflow.com/questions/39810343/lottery-program-without-arrays-with-java

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a 2 digit number");
		int userinput = input.nextInt();

		// Get digits from lottery
		int lotteryDigit1 = lottery/100;
		int lotteryDigit2 = (lottery%100) / 10;
		int lotteryDigit3 = lottery%10;

		// Get the digits from the userinput
		int userinput1 = userinput/100;
		int userinput2 = (userinput%100) / 10;
		int userinput3 = userinput%10;

		System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);

		if(userinput == lottery) {
			System.out.println("Exact match: you win $10,000");
		} else if ((userinput1 == lotteryDigit2 && userinput2 == lotteryDigit1 && userinput3 == lotteryDigit3)
				|| (userinput1 == lotteryDigit2
				&& userinput1 == lotteryDigit3 && userinput3 == lotteryDigit1)
				|| (userinput1 == lotteryDigit3
				&& userinput2 == lotteryDigit1 && userinput3 == lotteryDigit2)
				|| (userinput1 == lotteryDigit3
				&& userinput2 == lotteryDigit2 && userinput3 == lotteryDigit1)
				|| (userinput1 == lotteryDigit1
				&& userinput2 == lotteryDigit3 && userinput3 == lotteryDigit2)) {
			System.out.println("Match all digits: you win $5,000");
		} else {
			System.out.println("Sorry, no match");
			input.close();
		}
	}
}
