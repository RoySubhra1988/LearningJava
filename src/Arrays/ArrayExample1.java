package Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // declaration of array
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//Lowest bound / index = 0
		//Upper bound / index (n-1)
		/*for(int i =0; i<a.length; i++) {	
		
		System.out.println(a[i]);
		}*/
		
		/*Disadvantages
		
		1. Size is fixed // to overcome this problem we need to use collections (Arraylist, linkedlist, hashtable etc)
		2. Stores Similar data type value // to overcome this issue we need to use Object Array
		
		*/
		
		//For each loop
		for(int i:a) {
			System.out.println(i);
		}

	}
 
}
