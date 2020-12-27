package HashMapConcept;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//HashMap Implements Map, Clonable and Serializable Interface 
		//HashMap Extends AbstractMap Class
		
		//No order- no Indexing
		//Stores the value in Key,Value pair format
		//key can not be duplicate
		//To add the value we need to use put method
		//We can store n number of null values but only one null key
		//hashmap is not Thread-safe or unsynchronized
		//Syntax - HashMap<Key,Value> ReferenceVariableName = new HashMap<Key,Value>();
		
		HashMap<String, Integer> mathMap = new HashMap<String, Integer> ();
		
		mathMap.put("Alom", 10);//1
		mathMap.put("Hasib", 20);//2
		mathMap.put("Subhra", null);//3
		mathMap.put(null, 30);//4
		mathMap.put("Salman", 40);//5
		mathMap.put("Babu", 50);//6
		
		System.out.println(mathMap.get("Alom"));
		
		//Iterator: over the keys - by using keySet
		
		Iterator<String> it = mathMap.keySet().iterator();
	
		while(it.hasNext()) {
			String name = it.next();
			//System.out.println(name);
			Integer value = mathMap.get(name);
			System.out.println(name + "--"+ value);
			
		}
		
		System.out.println("================================");
		
		//Iterator: Over the Set (Pair): By Using entrySet
		
		Iterator<Entry<String,Integer>> newMap = mathMap.entrySet().iterator();
		
		while(newMap.hasNext()) {
			Entry<String, Integer> it1 = newMap.next();
			
			System.out.println(it1.getKey() + "=="+ it1.getValue());
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		//Iterate HashMap using Java8 and for each and Lambda
		
		//mathMap.forEach((p,q)-> System.out.println(p + "__" + q));
		
		mathMap.forEach((Alom,Hasib)-> System.out.println("Key =" +Alom+ "-----"+ "Value ="+ Hasib));

	}

}
