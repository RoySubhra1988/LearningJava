package Inheritance;

public class TestFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandFather gf = new GrandFather();
		
		gf.methodA();
		
		System.out.println("---------------------");
	
		
		Father f = new Father();
		
		f.methodA();
		f.methodB();
	
		System.out.println("---------------------");
		
		Son s = new Son();
		
		s.methodA();
		s.methodB();
		s.methodC();
		System.out.println("---------------------");
		
		GrandSon gs = new GrandSon();
		
		gs.methodA();
		gs.methodB();
		gs.methodC();
		gs.methodD();
		System.out.println("---------------------");
		
		

	}

}
