package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
ArrayList<String> s1 = new ArrayList<String>();

s1.add("Trump");//0
s1.add("Biden");//1
s1.add("Alom");//2
s1.add("Subhra");//3
s1.add("Hasib");//4
s1.add("Subhra");//5
s1.add("Subhra");//6
s1.add("Hasib");//7
s1.add("Subhra");//8
s1.add("Trump");//9


ArrayList <String> s2 = new ArrayList<String>();

s2.add("Chicken");
s2.add("Lamb");

//addAll() Method

/*s1.addAll(s2);
System.out.println(s1);

s1.addAll(1,s2);
System.out.println(s1);// Trump, Chicken, Lamb, Biden, Alom, Subhra, Hasib


//Clear()
s1.clear();
System.out.println(s1);*/

//Clone()


ArrayList<String> cloneList = (ArrayList<String>)s1.clone();

System.out.println(cloneList);

//contains returns True or false

System.out.println(s1.contains("Alom"));

System.out.println(s1.contains("l"));

// IndexOf() ---> if we give any condition then it will return Boolean value. Or if we just mention the value then it will return the index number

System.out.println(s1.indexOf("Hasib")>0);
System.out.println(s1.indexOf("Hasib"));

System.out.println(s1.lastIndexOf("Trump"));

System.out.println(s1);

s1.remove(6);
System.out.println(s1);

s1.remove("Trump");
System.out.println(s1);

s1.remove("Trump");
System.out.println(s1);

// How to Find the Even or odd numbers from the Given Number

ArrayList<Integer> var = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

var.removeIf(num -> num%2==0);
System.out.println(var);

//RetainAll method

System.out.println(s1);
System.out.println(s1.size());

s1.retainAll(Collections.singleton("Hasib"));


System.out.println(s1);
System.out.println(s1.size());

// How to create the sublist from an arraylist

ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

ArrayList<Integer> subList = new ArrayList<Integer>(number.subList(3, 9));

System.out.println(subList);

//How to convert Arraylist to single dimensional Array

ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


Object arr [] = numberList.toArray();

for (Object o:arr) {
	System.out.println((int) o);
}


	}

}
 