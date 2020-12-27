package Constructor;

public class House {
	
	static int bedRoom = 5 ;
	int bathRoom ;
	static String name = "Hasib Villa";
	
	House(){
		
	}
	
	House(int bedRoom, int bathRoom, String name){
		this.bedRoom=bedRoom;
		this.bathRoom = bathRoom;
		this.name=name;
	}
	
	House(int i, int j) {
		this.bedRoom=i;
		this.bathRoom=j;
		
	}

	public static void getBedRoom() {
		System.out.println("We have "+ bedRoom + " bed room");
	}
	
	public void getBathRoom() {
		System.out.println("We have "+ bathRoom + " bath room");
	}
	
	public void getName() {
		System.out.println("The name of our house is  "+ name);
	}
	

}
