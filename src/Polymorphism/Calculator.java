package Polymorphism;

public class Calculator {
	
	public int CalcArea(int a, int b) {

		int total = a + b;
		return total;

	}

	public int CalcArea(int a, int b, int c) {

		int total = a + b + c;
		return total;
	}

	public int CalcArea(int a, int b, int c, int d) {

		int total = a + b + c + d;
		return total;

	}
	public double CalcArea(double a, int b, int c, int d) {

		double total = (a + b + c + d);
		return total;
}

}
