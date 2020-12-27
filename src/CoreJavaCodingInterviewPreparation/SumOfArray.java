package CoreJavaCodingInterviewPreparation;

public class SumOfArray {
	
	static int [] b = {5,10,15,20};
	
	public int sumOfB(int[]b) {
		
		int sumB =0;
		
		for(int i=0; i<b.length; i++) {
			
			sumB = sumB + b[i];
			
		}
		
		return sumB;
		
	}
	
	//Create a Method Which accepts Array and returns Sum of all the elements of Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = new int[10];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;
	
		
		int sum = sumOfArray(a);
		
		System.out.println("Sum of Array variable a : " + sum); // 55
		
		System.out.println("************************************");
		
		// this is for sum of b 
		
		SumOfArray sumOfArray = new SumOfArray();
		
		int sumOfB = sumOfArray.sumOfB(b);
		
		System.out.println("Sum of Array variable b : " + sumOfB); // 50
		
		

	}

	public static int sumOfArray(int[] a) {
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum = sum + a[i];
			
		}
		
		return sum;
	}

}
