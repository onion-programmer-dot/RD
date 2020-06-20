package com.rd.interview;

import java.math.BigInteger;

public class TestBigInteger {

	public static void main(String[] args) {

		BigInteger bi = new BigInteger("18");
		
		// When certainty is one, 
        // it will check number for prime or composite 
		
		System.out.println(bi.isProbablePrime(1));
		
		
		// When certainty is zero, 
        // it is always true 
		System.out.println(bi.isProbablePrime(0));
		
		
		// When certainty is negative, 
        // it is always true
		System.out.println(bi.isProbablePrime(-1));
		
		
		
	}

}
