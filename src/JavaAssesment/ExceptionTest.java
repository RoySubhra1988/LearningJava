package JavaAssesment;

public class ExceptionTest {
	public Integer divide(int a, int b) {
		try {
			return a/b;
		}
		finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionTest test = new ExceptionTest();
		
		try {
			System.out.println(test.divide(10,0));
		}
		catch(Exception ex) {
			System.out.println("Division by 0!");
		}
	}

}
