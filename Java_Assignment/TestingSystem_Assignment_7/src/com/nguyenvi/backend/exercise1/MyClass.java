package com.nguyenvi.backend.exercise1;

public class MyClass {

	// For math 
	// Min

	public static int sum(int[] arr)
	{
		int sum = 0; 
		for(int a : arr)
		{
			sum = sum + a; 
		}
		return sum; 
	}
	public static int min(int[] arr)
	{
		int min = arr[0]; 
		for(int i = 1 ; i< arr.length ; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i]; 
			}
		}
		return min; 
	}
}
