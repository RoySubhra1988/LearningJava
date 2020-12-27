package Polymorphism;

public class OverLoading {
	
	public void price () {
		
		int a = 10;
		int b = 20;
		System.out.println("The Price is : " + (a+b) );
	}
	
	public void price (int a, int b) {
		
		System.out.println("The Price is : " + (a+b) );
	}
	
	public void price (int b , double a) {
		
		
		System.out.println("The Price is : " + (a+b) );
	}
	
	public void price (String product, int a, int b) {
	

	System.out.println("The Price is : " + (a+b) );
}

}
