package Polymorphism;

public class TestOverriding {

	public static void main(String[] args) {
		
		
		//Overriding2 obj = new Overriding2();
		
	
			//obj.price();
			
			Calculator c = new Calculator();
			
			System.out.println(c.CalcArea(2, 3));
			System.out.println(c.CalcArea(5, 7, 9));
			System.out.println(c.CalcArea(1.2, 4, 6, 8));
			System.out.println(c.CalcArea(2, 3, 4, 5));
			
			System.out.println("=========================");
			
			ModernCalculator mc = new ModernCalculator();
			
			System.out.println(mc.CalcArea(2, 3));
			System.out.println(mc.CalcArea(5, 7, 9));
			System.out.println(mc.CalcArea(1.2, 4, 6, 8));
			System.out.println(mc.CalcArea(2, 3, 4, 5));
			
			
			
			
	}

}
