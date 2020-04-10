package com.apex.day2;

public class Switch {

	public static void main(String[] args) {
		
		String day = "Tuesday";
		switch(day) {
		case "Monday": 
            System.out.println("Monday"); 
            break; 
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
			
		default:
			System.out.println("Today is Sunday");
		}

	}

}
