package JavaClass;

public class House {
	
	public House() {
		
	}
	
	public House( int bedRoom) {
		this.bedRoom = bedRoom;
	}
	
	public House (String houseName) {
		this.houseName = houseName;
	}
	
	public House(String houseName, int bedRoom) {
		
	}
	

	String houseName = "Hasib's Palace";

	int bedRoom = 6;
	double bathRoom = 2.5;

	public void livingRoom() {

		System.out.println("I can Play Soccer in my living room");

	}

	public int kitchen(int window) {

		System.out.println("There are " + window + " window in the kitchen");

		return window;
	}
	
	

}
