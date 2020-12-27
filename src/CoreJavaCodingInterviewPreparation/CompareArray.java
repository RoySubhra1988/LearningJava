package CoreJavaCodingInterviewPreparation;

import java.util.ArrayList;
import java.util.Iterator;

public class CompareArray {
	
	// Compare same indexes for 2 different arrays and create another array of matching values

	public static void main(String[] args) {
		
		int [] hasib = {9,1,7,4,7,6,4,1,4,9};
		
		int [] tanu = {9,2,9,4,5,6,8,1,8,9};
		
		ArrayList <Integer> modon = new ArrayList <Integer>();
		
		for(int i =0; i<hasib.length; i++) {
			
			if(hasib[i] == tanu[i]) {
				
				modon.add(tanu[i]);
				
			}
			
		}
		
		//Iterating the ArrayList
		
		Iterator<Integer> it = modon. iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//converting arrayList back to array
		
		Object[] lalu = modon.toArray();
		
		for(Object obj : lalu) {
			
			System.out.println(obj);
		}
		
		

	}

}
