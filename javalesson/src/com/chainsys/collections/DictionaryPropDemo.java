package com.chainsys.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class DictionaryPropDemo {
	public static void main(String args[])
	{
		Properties capitals=new Properties();//Properties<String>capitals=new Properties();
	    Set<Object>states;//Set<String>states
	    String str;
	    capitals.put("Illinois","Springfield");
	    capitals.put("Florida","Tallahassee");
	    capitals.put("Missouri","Jefferson City");
	    capitals.put("Washington","Olympia");
	    capitals.put("California","Sacramento");
	    capitals.put("Indiana","Indianapolis");
	    states=capitals.keySet();//get set-view of keys
	    Iterator<Object> itr=states.iterator();
	    while(itr.hasNext())
	    {
	    	str=(String)itr.next();
	    	System.out.println("The capital of"+str+"is"+capitals.getProperty(str)+".");
	    }
	    //look for state not in list--specifydefault 
	    str=capitals.getProperty("TamilNadu","Not Found");
	    //str=capitals.getProperty("Florida");
	    System.out.println("The capital of TamilNadu is "+str);
	
	
	
	
	
	
	
	
	}

}
