package com.xworkz.example;

public class Occurance {

	public static int first = -1;
	public static int last = -1;

	static void findOccurance(String str, int index, char element) {
		
		if(index==str.length())
		{
			System.out.println("first is :"+first);
			System.out.println("last is :"+last);
			return;
		}
		
		char currChar=str.charAt(index);
		if(currChar==element) {
			if(first==-1) {
				first=index;
			}
			else {
				last=index;
			}
		}
		findOccurance(str, index+1, element);
	}

	public static void main(String[] args) {
		String str = "abbabbbca";
		findOccurance(str,8,'a');
	}

}
