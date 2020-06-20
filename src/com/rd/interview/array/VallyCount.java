package com.rd.interview.array;

public class VallyCount {

	public static void main(String[] args) {
		
		String str = "DDUUDDUDUUUD";
		int steps = 0;
		int vallyCount=0;
		for(int i=0; i < str.length(); i++ ){
			
			char C = str.charAt(i);
			
			if('U' == C){
				steps++;
				if(steps == 0) vallyCount++;
			}else{
				steps--;
				
			}
			
		}
		
		System.out.println(vallyCount);
	}

}
