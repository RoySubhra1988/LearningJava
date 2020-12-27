package CoreJavaCodingInterviewPreparation;

public class SortingArray {

	public static void main(String[] args) {
		
		int [] a = {9,1,7,4,5,6,2,1,3,8};
		
		int temp;
		
		for(int i =0 ; i<a.length;i++) {
			
			for(int j =i+1; j<a.length; j++) {
				
				if (a[i] > a[j]) {
				//swap
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
			
		}
		
		for(int k=0; k<a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
