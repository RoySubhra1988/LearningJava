package OOPConceptAbstractInterface;

public class DreamCar extends BMW implements ParentCar{

	
	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println("Change the gear when the speed is 20 mile per hour");
	}


	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Press the excelarator to speed up to 40 mile per hour ");
	}


	public void applyBreaks() {
		// TODO Auto-generated method stub
		System.out.println("Firmly apply the Breaks to reduce the speed");
	}


	public void Battery() {
		// TODO Auto-generated method stub
		System.out.println("It has a very powerfull battery");
	}

}
