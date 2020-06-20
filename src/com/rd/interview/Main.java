package com.rd.interview;

public class Main {

	public static void main(String[] args) {
		
		Phone phone = new Phone(Phone.OSType.ANDROID);
		
		/*if(phone.getOsType().equals(Phone.OSType.ANDROID)){
			
			//new Andoid().process(phone);
		}*/
		
		RuleEngine ruleEngine = new RuleEngine();
		ruleEngine.registerRul(new IPhone())
				  .registerRul(new Andoid());
		
		Phone rule = ruleEngine.rule(phone);
		
		System.out.println(rule);
		
		
		
		
	}

}
