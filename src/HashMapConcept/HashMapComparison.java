package HashMapConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

	public static void main(String[] args) {
		
		
		HashMap<String, Integer> marks1 = new HashMap<String, Integer>();
		
		marks1.put("Math", 80);
		marks1.put("English", 40);
		marks1.put("Histroy", 50);
		
		HashMap<String, Integer> marks2 = new HashMap<String, Integer>();
		
		marks2.put("English", 40);
		marks2.put("Math", 80);
		marks2.put("Histroy", 50);

		HashMap<String, Integer> marks3 = new HashMap<String, Integer>();
		
		marks3.put("English", 40);
		marks3.put("Math", 80);
		marks3.put("Histroy", 50);
		marks3.put("Histroy", 90);
		
		
		//1. On the Basis of KEY-VALUE Using Equals method
		
		System.out.println(marks1.equals(marks2));//True
		System.out.println(marks1.equals(marks3));//false
		
		//2. On the Basis of KEYSet Using Equals method
		
		System.out.println(marks1.keySet().equals(marks2.keySet())); //true
		System.out.println(marks1.keySet().equals(marks3.keySet())); //true
		
		//How to find the Extra key
		HashMap<String, Integer> marks4 = new HashMap<String, Integer>();
		
		marks4.put("English", 40);
		marks4.put("Math", 80);
		marks4.put("Histroy", 50);
		marks4.put("CSC", 90);
		
		//We have  to combine the keys from 1st hashmap using hashSet
		
		HashSet<String> extraKeys = new HashSet<String>(marks1.keySet());
		
		//Add the 2nd hashmap keys to the 1st hashmap
		
		extraKeys.addAll(marks4.keySet());
		extraKeys.removeAll(marks1.keySet());
		
		System.out.println(extraKeys);
		
		// Onthe Basis of Values using Equal method
		
		HashMap<String, Integer> marks5 = new HashMap<String, Integer>();
		
		marks5.put("Math", 80);
		marks5.put("English", 80);
		marks5.put("Histroy", 50);
		
		HashMap<String, Integer> marks6 = new HashMap<String, Integer>();
		
		marks6.put("Math", 80);
		marks6.put("English", 80);
		marks6.put("Histroy", 50);
		
		HashMap<String, Integer> marks7 = new HashMap<String, Integer>();
		
		marks7.put("Math", 80);
		marks7.put("English", 80);
		marks7.put("History", 50);
		marks7.put("CSC", 50);

		
		//1. Using Arraylist Where the Value can be duplicated
		
		ArrayList<Integer> alom  = new ArrayList<Integer>(marks5.values());
		
		ArrayList<Integer> hasib  = new ArrayList<Integer>(marks6.values());
		
		ArrayList<Integer> subhra  = new ArrayList<Integer>(marks7.values());
		
		System.out.println(alom.equals(hasib));// true
		System.out.println(alom.equals(subhra));// false
		
		
		//1. Using Hashset Where the Value can not be duplicated
		
				HashSet<Integer> boga  = new HashSet<Integer>(marks5.values());
				
				HashSet<Integer> moga  = new HashSet<Integer>(marks6.values());
				
				HashSet<Integer> choga  = new HashSet<Integer>(marks7.values());
				
				System.out.println(boga.equals(moga));// true
				System.out.println(boga.equals(choga));// true
		
	}

}
