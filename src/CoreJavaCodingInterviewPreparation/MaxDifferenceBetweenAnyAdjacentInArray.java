package CoreJavaCodingInterviewPreparation;

public class MaxDifferenceBetweenAnyAdjacentInArray {

	public static void main(String[] args) {
		
		
		int[] a = {1, 5,8,19,34,28,90};
		
		int diff = 0;
		for(int i =0; i<a.length-1; i++) {
			
			if(a[i+1] - a[i]>diff)
			{
			diff = a[i+1] - a[i];
			}
		
			}
		System.out.println(diff);
	}

}
