package Polymorphism;

public class Overriding2 extends Overriding {
	
	public int price () {
		int a= 10;
		int b = 20;
		int total = a+b;
		
		System.out.println("The Total is : "+ (total + 100));
		
		return total;
		
	}


}
