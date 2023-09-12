package practice;

import java.util.Scanner;

public class Emp {

	int id;
	String name;
	double salary;
	String designation;
	
	Emp()
	{
		this.id = -99;
		this.name = null;
		this.salary = 0.0;
		this.designation = "test engineer";
	}
	Emp(int idVal, String nameVal, double salaryVal)
	{
		this.id= idVal;
		this.name = nameVal;
		this.salary = salaryVal;
	}
	
	public static void main(String[] args) {
		
		Emp e1= new Emp();
		e1.acceptDetail();
		e1.showDetail();
		
		Emp e2= new Emp(121, "john", 10000.00);
		e2.showDetail();
	}


	public void acceptDetail() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,salary, designation for employee");
		this.id = sc.nextInt();
		this.name = sc.next();
		this.salary = sc.nextDouble();
		this.designation = sc.next();
	
	}
	
	public void showDetail() {
		System.out.println(this.id + "\t" + this.name + "\t" + this.salary +"\t" + this.designation );
		
	}

}
