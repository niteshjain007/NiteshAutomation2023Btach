package practice;

public class MethodDemo2 {
	
	  static void myMethod(String fname)
	  {
		    System.out.println(fname + " qaTestology");
	 }

	 public static void main(String[] args) 
	 {
		    myMethod("Liam");
		    myMethod("Jenny");
		    myMethod("Anja");
		    
		    printFullName("nitesh", "india", 34);
	 }

	 
	  static void printFullName(String fname, String lname, int age)
	  {
		    System.out.println(fname + "\t" + lname);
		    System.out.println("Age of the member is ==" + age);
	 }

}
