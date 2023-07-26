package com.xworkz.example;

import java.util.Scanner;

public class TowerOfHanoi {
	
	static void tower(int n, String src, String help, String dest)
	{
		if(n==1)
		{
			System.out.println("disk "+n +" from "+src+" to "+dest);
			return;
		} 
		tower(n-1, src, dest, help);
		System.out.println("disk "+ n +" from "+src+" to "+dest);
		tower(n-1,help,src,dest);
	}
	public static void main(String[] args) {
		int n=2;
		tower(2,"s","h","d");
	}
	

}