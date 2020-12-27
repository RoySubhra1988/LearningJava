package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighestNumber {

	public static void main(String[] args) {
		//1. by sorting and pick the number at (n-2) index but sorting approach doesnot work if the element of an array is repeated
		
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		int n = arr.length;
		
		Arrays.sort(arr);
		
		System.out.println("Second Highest number is : " + arr[n-2] );
		
		//2. 

	}

}
