package com.heroku.javatest;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MyTestClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2167355925410420452L;
	
	static int count = 0;
	
	String time = getFormattedDate();
	
	public static String getFormattedDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("IET"));
		return dateFormat.format(new Date());
	}
	
	public MyTestClass() {
		count++;
	}

	@Override
	public String toString() {
		return "{ "
				+ "timestamp: " + time + " calls: " + count +"}";
		
	}
	
	
	
}
