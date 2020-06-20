package com.rd.interview;

/**
 * @author alok.kumar
 *
 */
public class Andoid implements RuleI<Phone, Phone>{

	@Override
	public Phone process(Phone input) {
		
		input.setModel("One plust 6");
		return input;
	}

	@Override
	public boolean matches(Phone input) {
		return input.getOsType().equals(Phone.OSType.ANDROID);
	}
}
