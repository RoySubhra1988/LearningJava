package OOPConceptAbstractInterface;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Audi = new Audi;
		
		Audi audi = new Audi();
		
		audi.applyBreaks();
		audi.changeGear();
		audi.speedUp();
	
		DreamCar dreamCar = new DreamCar();
		
		dreamCar.applyBreaks();
		dreamCar.Battery();
		dreamCar.changeGear();
		dreamCar.speedUp();

	}

}
