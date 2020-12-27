package Encapsulation;

public class TestEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees kalim = new Employees();
		kalim.setEmpName("Alam Mahboob");
		kalim.setEmpID(100);
		kalim.setEmpDOB("01/01/1986");
		kalim.setEmpSalary(100000.00);
		
		System.out.println("Name       EmpID     DOB     Salary ");
		System.out.println(kalim.getEmpName() + " " + kalim.getEmpID()+ " "+ kalim.getEmpDOB()+ " " + kalim.getEmpSalary());

		Employees rahim = new Employees();
		
		rahim.setEmpName("Ryan Hasib");
		rahim.setEmpID(101);
		rahim.setEmpDOB("01/01/1990");
		rahim.setEmpSalary(120000.0);
		
		System.out.println("Name       EmpID     DOB     Salary ");
		System.out.println(rahim.getEmpName() + " " + rahim.getEmpID()+ " "+ rahim.getEmpDOB()+ " " + rahim.getEmpSalary());

		
	}

}
