package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		
		
		//Using LinkedHashSet
		ArrayList<Integer> numbers =  new ArrayList<Integer>(Arrays.asList(1,2,1,2,3,4,5,6,1,3,7,8,3,4,5,6,7,8,7,8,9,6,7,8));
		
		LinkedHashSet<Integer> linkedNumbers = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numbersWithOutDuplicateValue = new ArrayList<Integer>(linkedNumbers);
		
		System.out.println(numbersWithOutDuplicateValue);
		
		
		ArrayList<String> names =  new ArrayList<String>(Arrays.asList("Alom","Hasib", "Subhra","Alom"));
		
		LinkedHashSet<String> linkedNames = new LinkedHashSet<String>(names);
		
		ArrayList<String> namesWithOutDuplicateValue = new ArrayList<String>(linkedNames);
		
		System.out.println(namesWithOutDuplicateValue);
		
		//JDK -8 - stream() Method
		
		List<Integer> kulsum = numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(kulsum);
	}

}
