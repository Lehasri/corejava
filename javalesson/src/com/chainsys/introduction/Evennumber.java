package com.chainsys.introduction;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
findEvenNumbers();
	}
	public static void findEvenNumbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 digit number:");
		long value=sc.nextLong();
		sc.close();
		long num=value;
		long reminder=0;
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				System.out.println(reminder);
			}
			num=num/10;	
		}
	}

}
