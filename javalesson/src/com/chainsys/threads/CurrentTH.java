package com.chainsys.threads;

public class CurrentTH {

	public static void main(String[] args) {
		 try{
			 Thread t1=Thread.currentThread();//it is available in default package java.lang
			 System.out.println("Th ID: " +t1.getId() );
			 System.out.println("Th State: " +t1.getState() );
			 System.out.println("Th Priority: " +t1.getPriority());
			 System.out.println("Th ISAlive: " +t1.isAlive());
			 System.out.println("Th Max Priority: " +Thread.MAX_PRIORITY);
			 System.out.println("Th Min priority: " +Thread.MIN_PRIORITY);
		 }
	catch(Exception e)
		 {
			 System.out.println(e.getMessage());
		 }

	}

}
