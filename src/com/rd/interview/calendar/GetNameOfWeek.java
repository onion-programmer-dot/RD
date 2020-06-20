package com.rd.interview.calendar;

import java.time.LocalDate;
import java.util.Calendar;

public class GetNameOfWeek {
	public static void main(String args[]){
		
		// 08 05 2015
		
		Calendar cal = Calendar.getInstance();
		 cal.set(Calendar.DAY_OF_MONTH, 5 ); //Set Day of the Month, 1..31
	     cal.set(Calendar.MONTH, 8); //Set month, starts with JANUARY = 0
	     cal.set(Calendar.YEAR, 2015); //Set year
	     
	     int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	     
	     System.out.println(dayOfWeek);
	     
	     
	     LocalDate a = LocalDate.of(2015, 8, 5);

	     System.out.println(a.getDayOfWeek().name());
	     
	}
}
