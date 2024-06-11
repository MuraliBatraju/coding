import java.util.* ;
public class EmpDetails {
	private int empId;
	private String empName;
	private static String companyName;
	public static void setCompanyName(String name) {
		companyName=name;

	}
	public EmpDetails(int empId, String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	public static void displayCompanyName() {
		System.out.println("The company name : "+ companyName);
	}
	public void displayDetails() {
		System.out.println("Employee ID: "+ empId);
		System.out.println("Employee Name: "+ empName);
		displayCompanyName();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails.setCompanyName("Anudeep foudation");
		EmpDetails emp1=new EmpDetails(123,"prabhas");
		EmpDetails emp2=new EmpDetails(456,"Gautham");
		emp1.displayDetails();
		emp2.displayDetails();



	}

}