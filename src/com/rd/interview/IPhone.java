package com.rd.interview;

public class IPhone implements RuleI<Phone, Phone>{

	@Override
	public Phone process(Phone input) {
		
		input.setModel("IPhone x");
		return input;
	}

	@Override
	public boolean matches(Phone input) {
		return input.getOsType().equals(Phone.OSType.IOS);
	}

}
