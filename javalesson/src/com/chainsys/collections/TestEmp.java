package com.chainsys.collections;

public class TestEmp {
public static void main(String[] args)
{
	Emp firstEmp=new Emp(111);
	Emp secondEmp=new Emp(111);//222
	System.out.println(firstEmp.hashCode());
	System.out.println(secondEmp.hashCode());
	boolean result=firstEmp.equals(secondEmp);
	System.out.println(result);
	result=firstEmp.equals(firstEmp);
	System.out.println(result);
	result=firstEmp.equals("Hello");//string object instead of employee object	
	System.out.println(result);
}
}
