package com.rd.interview.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        
        /* Perfrom queries on Linked List */
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        
        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        
		
		/*System.out.println("Enter valjue ===========");
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();		
		List<Integer> list = new ArrayList<Integer>(size);
		
		in.nextLine();
		String intStr  = in.nextLine();
		
		String[] split = intStr.split(" ");
		for(String s : split){
			list.add(Integer.parseInt(s));
		}
		
		int numOfQuery =  in.nextInt();
		in.nextLine();
		for(int i=0; i<numOfQuery; i++){
			
			String nextLine = in.nextLine();
			//System.out.println(nextLine);
			if("Insert".equals(nextLine)){
				String insert =  in.nextLine();
				//System.out.println(insert);
				String[] insertArrr = insert.split(" ");
				int index = Integer.parseInt(insertArrr[0])-1;
				if(index < size){
					list.add(index+1, Integer.parseInt(insertArrr[1]));
				}
			}else if("Delete".equals(nextLine)){
				String delete = in.nextLine();
				int index = Integer.parseInt(delete.trim());
				if(index < size){
					list.remove(index);
				}
			}
		}
		for(int i=1; i<=list.size() ; i++){
			if(i < list.size()){
				System.out.print(list.get(i-1)+" ");
			}else{
				System.out.print(list.get(i-1));
			}
			
		}*/

	}

}
