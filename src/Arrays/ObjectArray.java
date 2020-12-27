package Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		
		// How to define/declare an array with Multiple data type with limit
			Object a[] = new Object[5];
			
			a[0] = 10;
			a[1] = 20.10;
			a[2] = "Welcome";
			a[3] = 'A';
			a[4]= true;
			
			
			for(Object i :a) {
				System.out.println(i);
			}
			System.out.println("***********************************************");
			// How to define/declare an array without the limits
			
			Object b[] = {100, 200.209, "Life", 'B', 300, false, 190, 2.90, 'G',};
			
			for (Object i :b) {
				System.out.println(i);
			}
			
	
	}

}
