package com.xworkz.example;

public class sortedArray {
	
	public static boolean sorted(int arr[], int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		
		if(arr[index]<arr[index+1])
		{
			return sorted(arr, index+1);
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,3};
		System.out.println(sorted(arr,0));
		
	}

}
