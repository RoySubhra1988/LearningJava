package WrapperClassConcept;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		
		String x = "100";
		
		System.out.println(x+20); // 10020
		
		// Data Conversion String to int
		
		int i = Integer.parseInt(x);
		System.out.println(i+20); // 120
		
		//String to double conversion
		
		String y = "12.22";
		
		double a = Double.parseDouble(y);
		System.out.println(a + 1.12);
		
	// String to boolean
		
		String k = "true";
		
		boolean b = Boolean.parseBoolean(k);
		
		System.out.println(b);
		
		// int to String conversion
		
		int e = 10;
		
		System.out.println(e+10);
		
		String c = String.valueOf(e);
		System.out.println(c+10);
		
	}

}
