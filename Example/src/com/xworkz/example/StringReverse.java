package com.xworkz.example;

import java.util.Scanner;

class StringReverse{
	
	static void reverse(String str, int index)
	{
		if(index==0)
		{
			System.out.println(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		reverse(str,index-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to reverse");
		String str=sc.nextLine();
		reverse(str,str.length()-1);
	}
}

