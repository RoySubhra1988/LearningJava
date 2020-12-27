package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> arr = new ArrayList<String>();

		arr.add("Hero Hasib");
		arr.add("Shahosi Hero Alom");
		arr.add("Movie Ta khub Pocha");
		arr.add("Babu Khaiso?");
		
		//typical For Loop
		
		for(int i =0; i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("================================");
		
		//For each loop
		
		for(String i : arr) {
			System.out.println(i);
			
		}
		System.out.println("================================");
		// Lamda Express Stream
		
		arr.stream().forEach(alom->System.out.println(alom));
		
		System.out.println("================================");
		
		// Iterator
		
		Iterator<String> modon = arr.iterator();
		
		while(modon.hasNext()) {
			System.out.println(modon.next());
		}
		
		/*System.out.println("================================");
		do {
			System.out.println("Dure giya mor");
			
			System.out.println(it.next());
		}while(it.hasNext());*/
		
		
				
	}

}
