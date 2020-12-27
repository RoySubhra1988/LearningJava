package JavaClass;

public class TestHouse {

	public static void main(String[] args) {
		
		House house = new House();
		
		House house1 = new House(8);
		
		House house2 = new House("Alam's House");
		
		System.out.println(house.bedRoom);
		System.out.println(house2.houseName);
		/*System.out.println(house.bathRoom);
		System.out.println(house.bedRoom);
		System.out.println(house.houseName);
		
		house.kitchen(2);
		house.livingRoom();*/
	}

}
