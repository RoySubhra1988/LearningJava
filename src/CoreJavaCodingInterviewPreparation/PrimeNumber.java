package CoreJavaCodingInterviewPreparation;

public class PrimeNumber {
	
	public static void getPrimeNumber(int number) {
		
		boolean flag = false;
		
		for (int i =2; i<=number/2; i++) {
			
			if(number%2 ==0) {
				flag=true;
				break;
			}
		}
		
		if (flag) {
			System.out.println(number + " is not Prime number");
		}else {
			System.out.println(number + " is Prime number");
		}
			
			
		
		
	}

	public static void main(String[] args) {
		
		getPrimeNumber(8);

	}

}
