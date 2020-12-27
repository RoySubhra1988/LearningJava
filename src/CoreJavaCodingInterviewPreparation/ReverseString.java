package CoreJavaCodingInterviewPreparation;

public class ReverseString {

	public static void main(String[] args) {
		

	// Reverse the string with out predefined reverse method
		
		String s = "RAMAKATAKAMAR";
		
		String t = "";
		
		for(int i = s.length()-1; i>=0; i--) {
			
			System.out.println(s.charAt(i));
			
			t = t + s.charAt(i);
			
		}
		
		System.out.println(t);
		
		if(s.equalsIgnoreCase(t)) {
			System.out.println(" This String is Palindrome");
		}else {
			System.out.println(" This String is not Palindrome");
		}
		
		// Using string buffer class and reverse method
		
		String a = "Mobile";
		
		StringBuffer sb = new StringBuffer(a);
		
		System.out.println(sb.reverse());

	}

}
