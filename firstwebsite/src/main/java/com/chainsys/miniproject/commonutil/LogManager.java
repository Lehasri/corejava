package com.chainsys.miniproject.commonutil;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
public class LogManager {
	public static void logException(Exception ex,String source,String exMessage) {
		Calendar vCalendar=Calendar.getInstance();
		Date today=vCalendar.getTime();
		if(source==null) {
			source="source not provided";
		}
		if(exMessage==null) {
			exMessage="Custom message not provided";
		}
		String message="Exception: "+today+" Message: "+ex.getMessage();
		message +="\n Source: "+source+" Custom message: "+exMessage;
		String fileName="ExceptionMessages"+today+".log";
		writeToFile(fileName,message);
	}
	public static void logException(Exception ex,String source) {
		Calendar vCalendar=Calendar.getInstance();
		Date today=vCalendar.getTime();
		if(source==null) {
			source="source not provided";
		}
		String message="Exception: "+today+" Message: "+ex.getMessage();
		message +="\n Source: "+source;
		String fileName="ExceptionMessages"+today+".log";
		writeToFile(fileName,message);
	}
	private static void writeToFile(String fileName,String message) {
		// TODO
		
		fileName = "D://LogManager//"+fileName+".txt";
		FileWriter fileWriter=null;
		try {
			fileWriter = new FileWriter(fileName,true);
			fileWriter.write(message);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}	
		
	}


}
