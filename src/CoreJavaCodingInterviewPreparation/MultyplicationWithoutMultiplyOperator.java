package CoreJavaCodingInterviewPreparation;

public class MultyplicationWithoutMultiplyOperator {
	//Print 5 multiplication table with out multiply operator
	
	static int a = 6;
	static int b = 6;
	
	
	public static  int multipy(int a, int b) {
	
		int sum = 0;
		for (int i=1; i<=b; i++) {
			
			sum = sum + a;
			
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
		
		int total = multipy(a, b);
		
		System.out.println(total);
		
		System.out.println("-----------------------------");
		
		int result = multiply2(100,100); 
		
		System.out.println(result);
		
		System.out.println("-----------------------------");
	}


	private static int multiply2(int i, int j) {
		
		int l =1;
		int sum = 0;
		while(l<=j) {
			
			sum = sum + i;
			l++;
			
		}
		return sum;
	}
	
	

}
