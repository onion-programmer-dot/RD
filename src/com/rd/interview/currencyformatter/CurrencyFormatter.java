package com.rd.interview.currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public CurrencyFormatter() {
		
	}
	
	public static void main(String args[]){
		
		double amount =200.0;
		 NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

	        String us = usFormat.format(amount);
	        String india = inFormat.format(cnFormat);
	        String france = frFormat.format(frFormat);
	        String china = cnFormat.format(inFormat);
	        
	        
	}

}
