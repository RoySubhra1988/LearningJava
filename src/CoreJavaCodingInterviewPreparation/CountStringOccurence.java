package CoreJavaCodingInterviewPreparation;

public class CountStringOccurence {

	public static void main(String[] args) {
		
//count number of occurrence of characters in the String 
		
//		CountStringOccurence cso = new CountStringOccurence();
//		
//		System.out.println(cso.countOccurrence("November",'e'));
		

		int count = countOccurrence("hassssssssssib", 's');
		
		System.out.println(count);
		
	}
	
	
	public  static int countOccurrence(String word, char c) {
		int num = 0;
		for(int i =0; i<word.length(); i++) {
			
			if (word.charAt(i)==c) {
				
				num++;
				
			}
			
		}
		
		
		return num;
		
	}

}
