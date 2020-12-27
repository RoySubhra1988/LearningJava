package CallByValueCallByReference;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		

		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 90;
		int y = 20;
		
		System.out.println(obj.testSum(x, y));// Call by value or Pass by value 
		
		
		obj.p = 30;
		obj.q = 75;
		
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int testSum(int a, int b) {
		
		int c= a+b;
		
		return c;
	}
	
	//Call by reference 
	
	public void swap(CallByValAndCallByRef d) {
		
		int temp;
		temp = d.p;
		d.p = d.q;
		d.q = temp;
		
		
	}

}
