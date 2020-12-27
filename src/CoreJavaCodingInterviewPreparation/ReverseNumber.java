package CoreJavaCodingInterviewPreparation;

public class ReverseNumber {

	public static void main(String[] args) {
	
	// using Arithmetic logic 	
		int a = 123456789;
		
		int reverse=0;
		
		while(a!=0) {
			int digit = a%10; // reminder will be the last digit (9)
			
			reverse = digit + reverse*10; // 90
			
			a= a/10; // 12345678
			
		}
		
		System.out.println(reverse);
		
		
		// Using stringBuffer class 
		
		StringBuffer sb = new StringBuffer(String.valueOf(reverse)).reverse();
		
		System.out.println(sb);
		

	}

}
