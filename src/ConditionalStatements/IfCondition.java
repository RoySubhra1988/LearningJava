package ConditionalStatements;

public class IfCondition {

	public static void main(String[] args) {
		
		//Case1: age>=18 eligible for vote
		//age<18 not eligible for vote

		int age = 15;

		if (age >= 18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}

		System.out.println(" Program exited.");
	}

}
