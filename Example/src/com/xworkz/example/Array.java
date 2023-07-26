package com.xworkz.example;

import java.util.Scanner;

public class Array extends Object{

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("entetr array size");
		int size = sc.nextInt();
		
		int[] numbers = new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("enter "+ i + "number" );
			numbers[i] = sc.nextInt();
		}
		
//		System.out.println("print array");
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(numbers[i]);
//		}
		
//		System.out.println("enter number x to be found");
//		int x = sc.nextInt();
//		for(int i=0;i<numbers.length;i++)
//		{
//			if(numbers[i]==x)
//			{
//				System.out.println("number x found at :" + i);
//			}
//		}
		
//		boolean isAscending = true;
//		
//		for(int i=0;i<numbers.length-1;i++)
//		{
//			if(numbers[i]>numbers[i+1])
//			{
//				isAscending=false;
//			}
//			
//		}
//		if(isAscending)
//		{
//			System.out.println("is in ascending order");
//		}
//		else
//		{
//			System.out.println("not in order");
//		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<numbers.length;i++)
		{
			if(numbers[i]<min)
			{
				min=numbers[i];
			}
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}
		
		System.out.println("largest number is : " + max);
		System.out.println("minimun number is : " + min);
		
		
		
	}
	
}

