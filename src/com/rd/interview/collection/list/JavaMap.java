package com.rd.interview.collection.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaMap {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		// create phone diary
		int phoneSize = scan.nextInt();
		scan.nextLine();
		
		Map<String, Long> map = new HashMap<>();
		for(int i=0; i < phoneSize; i++){
			String name = scan.nextLine();
			long phoneNumber = scan.nextLong();
			scan.nextLine();
			map.put(name, phoneNumber);
			//System.out.println(name + "   "+phoneNumber);
		}
		
		
		while(scan.hasNext()){
			String name = scan.nextLine();
			Long number = map.get(name);
			if(number == null){
				String[] split = name.split("");
				number = map.get(split[0]);
				
			}
			
			if(number != null){
				System.out.println(name +"="+ number.longValue());
			}else{
				System.out.println("Not found");
			}
		}
		
	}

}
