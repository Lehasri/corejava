package com.chainsys.trylesson;

public class A {
	public static void m1() {}
	public static void m2() {}
	public static void m3() 
	{
		try 
		
		{
			m4();
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch"+e.getMessage());
			Throwable t1=e.getCause();
			System.out.println("Cause"+t1.getMessage());
		}
	}
	public static void m4()throws Exception//while calling this error,because it throws exception
	{
		Exception e1=new Exception ("Error 1");
		//Inner Exception
		//e1 is nested inside e2
		Exception e2=new Exception("Error 2",e1);
		throw e2;
	}
	public static void testM4()
	{
		
	}

}
