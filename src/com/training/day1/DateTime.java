package com.training.day1;
import java.*;
import java.text.*;
import java.util.Date;

public class DateTime {

	
	public static void main(String[] args) throws Exception {
		Date d=new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		String d1=df.format(d);

		
	}

}
