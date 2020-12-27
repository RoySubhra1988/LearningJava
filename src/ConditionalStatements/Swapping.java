package ConditionalStatements;

public class Swapping {

	public static void main(String[] args) {
		
		int a =10;
		int b = 20;
		
		System.out.println("Value of a before swapping is :" + a);
		System.out.println("Value of b before swapping is :" + b);
		
		//Swapping with a temporary variable c
		
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of a after swapping is :" + a);
		System.out.println("Value of b after swapping is :" + b);
			

	}

}
