package com.exercise.demo;

import java.util.ArrayList;

import exerice.com.demo.INteger;

public class Exercise001 {

	public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		
		int sum = findSum(numbers);
		
		System.out.println("Even Sum = "+sum);

}

	public static int findSum(ArrayList<Integer> numbers)
	{
		int sum = 0;
		
		for(int n : numbers) 
		{
			if(n%2 ==0)
			   sum=sum+n;
		}
		
		return sum;
	}

}
