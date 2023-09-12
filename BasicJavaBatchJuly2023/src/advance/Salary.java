package advance;

public class Salary extends Employee{

	 private double sal;   // Annual salary
	   
	   public Salary(String name, String address, int number, double mysal) {
	      super(name, address, number);
	      setSalary(mysal);
	   }
	   
	   public void mailCheck() {
		      System.out.println("Within mailCheck of Salary class ");
		      System.out.println("Mailing check to " + getName() + " with salary " + sal);
		   }
		
	   
	   public double getSalary() {
	      return sal;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	    	  sal = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary pay for " + getName());
	      return sal/52;
}
}
