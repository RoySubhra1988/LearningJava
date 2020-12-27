package CoreJavaCodingInterviewPreparation;

public class MInNumberAndMaxNumberMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int min = a[0][0];
		
		int max = a[0][0];
		
		
		// get the minimum number from multi dimensional array
		
		for(int row=0; row<a.length;row++) { // rowv a.length
			
			for(int col=0; col<a[0].length; col++) { //col a[0].length
				
				if(a[row][col]<min) {
					
					min = a[row][col];
					
				}
				
			}
			
		}
		System.out.println(min);
		
		// get the maximum number from multi dimensional array
		
		for(int row=0; row<a.length;row++) { // rowv a.length
			
			for(int col=0; col<a[0].length; col++) { //col a[0].length
				
				if(a[row][col]>max) {
					
					max = a[row][col];
					
				}
				
			}
			
		}
		System.out.println(max);

	}

}
