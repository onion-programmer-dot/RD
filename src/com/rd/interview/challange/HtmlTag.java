package com.rd.interview.challange;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTag {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			
          	String tagContentExtractorStr = tagContentExtractor1(line);
            System.out.println(tagContentExtractorStr);
			
			testCases--;
		}
	}

	
	
	private static String tagContentExtractor1(String str){
        int tagStartIndex=-1, tagEndIndex=-1;
        boolean isEndTag=false, newLine = false;
        Stack<String> stack= new Stack<String>();
        String result =str; 
        
        for(int i=0; i < str.length(); i++){
            
            if('<' == str.charAt(i)){
                tagStartIndex = i;
            }else if('>' == str.charAt(i)){
                tagEndIndex = i;
            }else if('/' == str.charAt(i) && tagEndIndex < 0 ){
                isEndTag=true;
            }
            
            try{
                
                if(tagEndIndex > 0){
                    String tag = str.substring(tagStartIndex, tagEndIndex+1);
                    
                    if(isEndTag ){
                        String eTag =  tag.substring(0,1)+tag.substring(2);
                        if(!eTag.equals(stack.pop())){
                            return "None";
                        }
                    }else{
	                    	if(stack.size() == 0){
	                    		result = result + "\n";
	                    	}
                        stack.push(tag);
                    }
                    
                    result = result.replace(tag, "");
                    
                    tagStartIndex=-1;
                    tagEndIndex=-1;
                    isEndTag=false;
                    
                }
            
            }catch(Exception e){
                return "None";
            }
        }
        
        return result.substring(3);
    }
	
	/**
	 * pattern based 
	 * @param line
	 */
	private static void showResult(String line){
		String pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";

        int count = 0;

            Pattern p = Pattern.compile(pattern);
            Matcher m =  p.matcher(line);

            while(m.find())
            {
                System.out.println(m.group(2));
                count++;
            }
            if(count == 0){
                System.out.println("None");
            }
	}
	
	
	
	private static String tagContentExtractor(String str){
		int tagStartIndex=-1, tagEndIndex=-1;
		boolean isEndTag=false, newLine = false;
		Stack<String> stack= new Stack<String>();
		String result =str; 
		
		for(int i=0; i < str.length(); i++){
			
			if('<' == str.charAt(i)){
				tagStartIndex = i;
			}else if('>' == str.charAt(i)){
				tagEndIndex = i;
			}else if('/' == str.charAt(i) && tagEndIndex < 0 ){
				isEndTag=true;
			}
			
					
			try{
				
			
				if(tagEndIndex > 0){
					String tag = str.substring(tagStartIndex, tagEndIndex+1);
					
					if(isEndTag ){
						String eTag =  tag.substring(0,1)+tag.substring(2);
						if(!eTag.equals(stack.pop())){
							return "None";
						}
						
					}else{
						stack.push(tag);
					}
					
					result = result.replace(tag, "");
					
					if(stack.size() == 0 && tagEndIndex > 0){
						result = result + "\n";
					}
					
					tagStartIndex=-1;
					tagEndIndex=-1;
					isEndTag=false;
					
				}
			
			}catch(Exception e){
				return "None";
			}
		}
		
		return result;
	}
	
	
	
}
