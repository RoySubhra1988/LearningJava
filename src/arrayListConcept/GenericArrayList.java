package arrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		

ArrayList<Integer> ar = new ArrayList<Integer>();

ar.add(10);
ar.add(20);

System.out.println(ar.get(1));

for(int i :ar) {
	System.out.println(i);
}


ArrayList<Double> ar1 = new ArrayList<Double>();

ar1.add(10.11);
ar1.add(10.12);

for(double i :ar1) {
	System.out.println(i);
}


ArrayList<Boolean> ar2 = new ArrayList<Boolean>();

ar2.add(true);
ar2.add(false);

for(boolean i :ar2) {
	System.out.println(i);
}


ArrayList<String> ar3 = new ArrayList<String>();

ar3.add("true");
ar3.add("false");

	}

}
