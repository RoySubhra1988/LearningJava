package HashMapConcept;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap = new HashMap<>();
		marksMap.put("Alom", 100);
		marksMap.put("Hasib", 200);
		marksMap.put("Tanu", 300);
	}

	public static void main(String[] args) {
		
		//1. Using HashMap Class
		
		HashMap<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		//2. Static Way: Static HashMap
		
		System.out.println(HashMapInitialization.marksMap.get("Alom"));
		
		//3. Immutable Map with one Single entry using Collections.singletonMap
		
		Map<String, Integer> map3 = Collections.singletonMap("Kyle", 400);
		
		System.out.println(map3.get("Kyle"));
		
		/*map3.put("Robert", 600);
		
		System.out.println(map3.get("Robert"));// java.lang.UnsupportedOperationException */
		
		//4. JDK -8 
		//Creating one 2D array using stream and collecting in the form of Map
		
		Map<String, String> map4 = Stream.of(new String[][] {
			
			{"Khali", "Strong Wrestler"},
			{"Undertaker", "Medium Wrestler"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(map4.get("Undertaker"));
		
		Map<Object, Object> map5 = Stream.of(new Object[][] {
			
			{"Khali", 700},
			{"Undertaker", "Strong Wrestler"},
			
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		map5.put("John Sina", 20.99);
		System.out.println(map5.get("John Sina"));
		System.out.println(map5.size());
		
		//using SimpleEntry: Mutable MAP
		
		Map<String, Integer> map6 = Stream.of(
				
				new AbstractMap.SimpleEntry<>("Sanjay", 100),
				new AbstractMap.SimpleEntry<>("Goru", 200)
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(map6.get("Sanjay"));
		
		map6.put("John Sina", 2099);
		System.out.println(map6.size());
		
		//using SimpleEntry: Immutable MAP
		
		Map<String, Integer> map7 = Stream.of(
				
				new AbstractMap.SimpleImmutableEntry<>("English", 70),
				new AbstractMap.SimpleImmutableEntry<>("Math", 80),
				new AbstractMap.SimpleImmutableEntry<>("Bangla", 90)
				
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		System.out.println(map7.get("Bangla"));
		
		map7.put("CSC", 86);
		System.out.println(map7.size());
		
		// JDK-9 
		
		//How to create the Empty Map
		
		Map<String, Integer> emptyMap = Map.of();
		System.out.println(emptyMap.size());
		/*emptyMap.put("John Sina", 2099); // java.lang.UnsupportedOperationException
		System.out.println(emptyMap.size()); */
		
		// How to create SingletonMap using Map.of()
		
		Map<String, Integer> singletonMap = Map.of("Lalu", 600);
		
		System.out.println(singletonMap.get("Lalu"));
		System.out.println(singletonMap.size());
		//singletonMap.put("Balu", 700); // java.lang.UnsupportedOperationException
				
		
		//How to Create Multi Values Map (Limitations): Maximum 10 Pairs can be Stored when over loading the Map.of() method
		Map<String, Integer> multiMap = Map.of("Lalu", 600, "Balu", 700, "Kalu", 800);
		
		System.out.println(multiMap.get("Kalu"));
		System.out.println(multiMap.size());
		//multiMap.put("Salu", 1000); // java.lang.UnsupportedOperationException
		
		//Map.ofEntries Method: Which does not have any limitations of storing the pairs(Key,Value)
		//Immutable maps
		
		Map<String, Integer> ofEntriesMap = Map.ofEntries(
				
				new AbstractMap.SimpleEntry<>("A", 10),
				new AbstractMap.SimpleEntry<>("B", 20),
				new AbstractMap.SimpleEntry<>("C", 30),
				new AbstractMap.SimpleEntry<>("D", 40),
				new AbstractMap.SimpleEntry<>("E", 50),
				new AbstractMap.SimpleEntry<>("F", 60)
				
				);
		System.out.println(ofEntriesMap.get("F"));
		
		System.out.println(ofEntriesMap.size());
		//ofEntriesMap.put("G", 70); // java.lang.UnsupportedOperationException
		
		// Maps Using Guava Jar
		
		//Map<String, String> nameMap = ImmutableMap.of("FirstName", "Subhra","MiddleName", "Tanu", "LastName", "Roy"); 
		// System.out.println(nameMap.get("LastName"));
		//nameMap.put("Suffix", "Mr"); // java.lang.UnsupportedOperationException
		
	}

}
