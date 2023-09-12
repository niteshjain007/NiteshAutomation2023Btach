package practice;

public class Employee {

	int empId;
	String empName;
	String hobbies ;
	
	Employee()   // constructor
	{
		empId=0;
		empName = "no name";
		hobbies = null;
	}
	
	Employee(int x, String n, String h)   // parameterized constructor
	{
		empId=x;
		empName = n;
		hobbies = h;
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.empId = 221;
		e1.empName = "anita";
		
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(e1.hobbies);
		
		Employee e2 = new Employee(224,"nitesh","travelling");
		System.out.println(e2.empId);
		System.out.println(e2.empName);
		System.out.println(e2.hobbies);
		
		
	}

}
