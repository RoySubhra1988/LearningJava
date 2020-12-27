package Polymorphism;

public class TestOverload {

	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		
		obj.price();
		obj.price(35, 78.90);
		obj.price(23, 35);
		obj.price("TV", 1300, 80);
	}


	
}
