package Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
// Declaration of two dimensional Array
		
		int a[][] = new int[4][3];
		
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		
		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;
		
		a[2][0] = 70;
		a[2][1] = 80;
		a[2][2] = 90;
		
		a[3][0] = 100;
		a[3][1] = 120;
		a[3][2] = 130;
		
		//Classic for loop
		for(int row=0; row<a.length;row++) { // rowv a.length
			
			for(int col=0; col<a[0].length; col++) { //col a[0].length
				
				System.out.print(a[row][col] + " ");
				
			}
			System.out.println();
		}
		//For each loop
		
		for(int i[]:a) {
			
			for(int j:i) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Object type two dimensional array
		Object b[][] = new Object[2][3];
		
		b[0][0] = 10;
		b[0][1] = 'A';
		b[0][2] = 30.12;
		
		b[1][0] = "Welcome";
		b[1][1] = true;
		b[1][2] = 30000.000006;
		
		
		//Classic for loop
				for(int row=0; row<b.length;row++) {
					
					for(int col=0; col<b[0].length; col++) {
						
						System.out.print(b[row][col] + " ");
						
					}
					System.out.println();
				}
				//For each loop
				
				for(Object i[]:b) {
					
					for(Object j:i) {
						
						System.out.print(j+" ");
					}
					System.out.println();
				}
		
		
		
		
	}

}
