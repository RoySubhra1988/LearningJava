package CoreJavaCodingInterviewPreparation;

import java.util.ArrayList;

public class FindUniqueNumber {

	public static void main(String[] args) {

		//int[] b = { 9, 1, 7, 4, 7, 4, 4, 1, 4, 9 };
		
		//int[] c = { 3, 4, 7, 6, 1, 2, 5, 0, 9, 5 };
		
		int[] a = { 3, 4, 4, 6, 9, 6, 5, 8, 9, 5 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!ab.contains(a[i])) {

				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						k++;
					}

				}

				//System.out.println(a[i] + " is Stored " + k + " times.");

				if (k == 1) 
					System.out.println(a[i] + " is the Unique Element");

				

			}

		}

	}

}
