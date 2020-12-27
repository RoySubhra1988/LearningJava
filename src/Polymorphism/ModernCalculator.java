package Polymorphism;

public class ModernCalculator extends Calculator{
	
	
	@Override
	public int CalcArea(int a, int b) {

		int total = (a + b) + 100;
		return total;

	}

	@Override
	public int CalcArea(int a, int b, int c) {

		int total = (a + b + c) * 100;
		return total;
	}

	
	@Override
	public int CalcArea(int a, int b, int c, int d) {

		int total = (a + b + c + d)/2;
		return total;


	}
}
