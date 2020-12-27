package StringMethods;

public class DifferentStringMethodsInJava {

	public static void main(String[] args) {
		
		String s = "Welcome";
		
		System.out.println(s.length()); // how to find number of characters
		
		//Concatenation
		
		String s1 = "Welcome to my ";
		String s2 = "Class";
				
		System.out.println(s1+s2); // one way to concat two String
		
		System.out.println(s1.concat(s2));// Using concat() method
		
		//equals() method - comparing two Strings
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		String b = "Bangladesh";
		System.out.println(s3.equals(s4)); // equals() - false
		System.out.println(s3.equalsIgnoreCase(s4)); // equalsIgnoreCase() - true
		
		//Contains
		
		System.out.println(s3.contains("COM")); //true
		System.out.println(s3.contains("ABC")); //false
		
		//Substring
		
		System.out.println(s3.substring(0,3)); // W E L
		System.out.println(s3.substring(2,5));// C M O
		System.out.println(s3.substring(4,7));// O M E
		
		System.out.println(b.substring(4, 10));// ladesh
		System.out.println(b.substring(3, 5)); // ngla
		System.out.println(b.substring(2, 6)); // ngla
		
		//Replace
		
		
		System.out.println(s3.replace('E', 'A')); // WALCOMA
	    System.out.println(s3.replace("COME", "KOME")); //WELKOME
		System.out.println(b.replace('g', 'G'));
		
		System.out.println(b.replaceAll(b, "Barguna"));
		System.out.println(b.replace("desh", "academy"));
	}

}
