package com.rd.interview;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {
	
	List<RuleI<Phone, Phone>> rules;
	
	public RuleEngine()
	{
		this.rules =  new ArrayList<>();
		
	}
	
	Phone rule(Phone phone){
		return rules.stream()
				.filter(rule -> rule.matches(phone))
				.map( rule -> (Phone) rule.process(phone))
				.findFirst()
				.orElseThrow(() -> new RuntimeException(" No mattching rule"));
	}
	
	public RuleEngine registerRul(RuleI<Phone, Phone> rule){
		
		rules.add(rule);
		return this;
	}
}
