package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		
		// There are 4 ways to compare between two ArraysList
		
		//1.First Sort and Then using equals() - method
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico"));
		
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Germany","Australia","Mexico"));
		
		ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico"));

		System.out.println(list1);
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1.equals(list2));// false
		System.out.println(list1.equals(list3));// true
		
		//2. Compare two ArrayList and find out the additional elements by using removeAll() - method
		
		ArrayList<String> list4 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico","Germany"));
		
		ArrayList<String> list5 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico"));
		
		list4.removeAll(list5);
		
		System.out.println(list4);// Germany
		
		//3. Find out the Missing Elements
		
		ArrayList<Integer> num1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
		
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
		//num1.removeAll(num2);
		
		num2.removeAll(num1);
		
		System.out.println(num2);//[8]
		
		//4. Find out the common Elements
		
		ArrayList<Integer> num3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
		
		ArrayList<Integer> num4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		num3.retainAll(num4);
		
		System.out.println(num3);
		
		ArrayList<String> list6 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico","Germany"));
		
		ArrayList<String> list7 = new ArrayList<String>(Arrays.asList("Bangladesh", "USA","Italy","Australia","Mexico"));
		
		list6.retainAll(list7);
		
		System.out.println(list6);
		
	}

}
