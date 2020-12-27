package arrayListConcept;

import java.util.ArrayList;

public class HasibCode {

	public static void main(String[] args) {
		
				
				ArrayList<Object> hasib = new ArrayList<Object>();
				
				hasib.add(100);
				hasib.add(200);
				hasib.add(300);
				//System.out.println(hasib);
				
				hasib.stream().forEach(yo ->System.out.println(yo));
				

				ArrayList<Integer> hasib2 = new ArrayList<Integer>();
				
				hasib2.add(400);
				hasib2.add(500);
				
				for(int i:hasib2) {
					System.out.println(i);
					
				}
				
				ArrayList<Double> hasib3 = new ArrayList<Double>();
				 
				hasib3.add(10.5);
				hasib3.add(12.5);
				 
				for(int i=0;i<hasib3.size(); i++){
					System.out.println(hasib3.get(i));
					
				}
				
				
				
				
			
	
	}

}
