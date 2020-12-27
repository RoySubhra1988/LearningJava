package Session1;

public class Operetors {

	public static void main(String[] args) {
		// Arithmetic Operators
		
		int a = 10;
		int b = 20;
		
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(a%b);
		
		//Relational Operators
		
		System.out.println(a<b); //true	
		System.out.println(a>b); //false
		System.out.println(a<=b); //true
		System.out.println(a>=b); //false
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		
		//Logical Operators
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		//Assignment Operator
		
		int c = a;
		System.out.println(c);
		
		c = b;
		System.out.println(c);
		
		c=100;
		c++; //c=c+1; // Increment Operator
		System.out.println(c);
		
		c--; //c=c-1; // Decrement Operator
		System.out.println(c);
		
		c+=5; //Assignment Operator
		System.out.println(c);
		
		c-=10; //Assignment Operator
		System.out.println(c);
		
		c*=2; //Assignment Operator
		System.out.println(c);
		
		c/=5; //Assignment Operator
		System.out.println(c);
		
		

	}

}
 