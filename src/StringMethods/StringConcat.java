package StringMethods;

public class StringConcat {

	public static void main(String[] args) {

		/*
		 * String a = "ALOM"; int b = 20; int c = 30;
		 * 
		 * System.out.println(b+c); // 50 System.out.println(b+c+a);// 50ALOM
		 * System.out.println(a+b+c);//ALOM2030
		 */

		// Post Increment

		int d = 1;
		System.out.println("The Value of d : " + d);
		int e = d++;
		System.out.println("The Value of d : " + d);
		System.out.println("The Value of e : " + e);
		System.out.println("******************************");
		
		// Pre Increment

		int g = 1;
		int h = ++g;
		System.out.println("The Value of g : " + g); // 2
		System.out.println("The Value of h : " + h); // 2
		System.out.println("******************************");

		// Post Decrement

		int i = 2;
		int j = i--;
		System.out.println("The Value of i : " + i); // 1
		System.out.println("The Value of j : " + j); // 2
		System.out.println("******************************");

		// Pre Decrement

		int k = 1;
		int l = --k;
		System.out.println("The Value of k : " + k); //
		System.out.println("The Value of l : " + l); //
		System.out.println("******************************");

	}

}
