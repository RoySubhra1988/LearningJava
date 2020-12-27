package CoreJavaCodingInterviewPreparation;

public class SwapValuesWithoutTemporaryVariable {

	public static void main(String[] args) {
		

		int a = 5;
		int b = 10;
		System.out.println("Before swap");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");

		
		//swap the value using temporary variable
		
		int temp;
		
		temp = b;
		b=a;
		a=temp;
		
		System.out.println("After swap");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		//swap the value without temporary variable
		
		int x = 5;
		int y = 10;
		
		System.out.println("before swap");
		
		System.out.println(x);
		System.out.println(y);
		
		x=x+y; // 5+10 = 15
		y=x-y; // 15-10 = 5
		x=x-y; // 15- 5 = 10
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("After swap");
		
		System.out.println(x);
		System.out.println(y);

	}

}
