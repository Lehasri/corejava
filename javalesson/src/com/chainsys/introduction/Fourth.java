package com.chainsys.introduction;
import java.util.*;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taskA();
		//taskB();
		taskC();
		//taskD();	
		
		}
		public static void taskA() 
		{
	    Scanner sca=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=sca.next();
		sca.close();
		System.out.println(name);
		}
		public static void taskB() {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter a number");
			int number=sc.nextInt();
			int result=number*100;
     		sc.close();
			System.out.println(result);
		}
		public static void taskC() {
			String s1="100";
			String s2="25";
			System.out.println(s1+s2);
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x+y;
			System.out.println(z);
		}
		public static void taskD() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc1.nextInt();
		if(age<=0)
			System.out.println("Invalid Age");
		else if(age<18)
			System.out.println("get driving license");
		else
			System.out.println("Happy driving");
	    sc1.close();
		}
			
		}
	




