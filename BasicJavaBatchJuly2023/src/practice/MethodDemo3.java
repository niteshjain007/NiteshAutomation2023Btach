package practice;

public class MethodDemo3 {

	public static void main(String[] args) {
		
		int result = doAddtion(3, 10, 9); // int result =b;
		System.out.println("addition result is=="+ result);
		
		System.out.println(myMethod(33));

		checkAge(10);
	}
	static int myMethod(int x) {
	    return 5 + x;
	  }
	
	
	static int doAddtion(int x, int y, int z)
	{
		int b = x+y+z;
		return b;
		
		
	}

	 // Create a checkAge() method with an integer variable called age
	  static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

}
}