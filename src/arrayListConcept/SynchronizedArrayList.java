package arrayListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		
	//1. Using Collections.SynchronizedList() - Method
		
		List<String> listName = Collections.synchronizedList(new ArrayList<String>());
		
		listName.add("Alom");
		listName.add("Hasib");
		listName.add("Subhra");
		
		//If we use add or remove method we do not need synchronization
		
		//But if we want to fetch/traverse/get the value from an ArrayList we need synchronization.
		
		synchronized (listName) {
			
			Iterator<String> it = listName.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
				System.out.println("________________________________");
				
				for(String s :listName) {
					
					System.out.println(s);
					
				}
			
		}
		
		//2. CopyOnWriteArrayList Class -- Thread safe By default 
		
		System.out.println("________________________________");
		
		CopyOnWriteArrayList<String> listName2 = new CopyOnWriteArrayList<String>();
		
		
		listName2.add("Ali Mahbooooooooob");
		listName2.add("Ur Ryan");
		listName2.add("Tanu Roy");
		
		Iterator<String> it2 = listName2.iterator();
		
		while(it2.hasNext()) {
			
			System.out.println(it2.next());
			
		}

		System.out.println("________________________________");
		
		for(int i=0; i<listName2.size();i++) {
			
			System.out.println(listName2.get(i));
			
		}
		System.out.println("===================================");
		
		//Lamda 
		
		listName2.stream().forEach(lol->System.out.println(lol));
		
	}

}
