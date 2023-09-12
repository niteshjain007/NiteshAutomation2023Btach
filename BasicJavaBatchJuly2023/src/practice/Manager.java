package practice;

public class Manager {

	double managerSalary;
	
	public static void main(String[] args) {
		
		Emp e3 = new Emp();
		
		System.out.println(e3.id + "\t" + e3.name + "\t" + e3.salary +"\t" + e3.designation );
		
		e3.acceptDetail();
		
		Manager m1 = new Manager();
		m1.calculateSalary(450, e3.salary);
		e3.showDetail();
		System.out.println("updated salary =" + m1.managerSalary);
		
	}
	
	public  void calculateSalary(double bonus, double salary)
	{
		this.managerSalary = bonus+salary;
	}
	
}



