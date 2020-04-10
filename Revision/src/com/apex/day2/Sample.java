package com.apex.day2;

public class Sample {
	
	public static void main(String[] args) {
		methodOne(2);
		methodTwo(6);
	}
    public static void methodOne(int a)
    {
        if (a % 2 == 0)
        {
            System.out.println("one");
        }
        else
        {
            methodTwo(a);
        }
    }
    public static void methodTwo(int b)
    {
        System.out.println("two");
        methodOne(b - 1);
        
    }
}
