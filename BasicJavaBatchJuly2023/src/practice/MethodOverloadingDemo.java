package practice;

public class MethodOverloadingDemo {

	
	static int plusMethod(int x, int y) {
		  return x + y;
		}

		static double plusMethod(double x, double y) {
		  return x + y;
		}

		
		static double plusMethod(double x,int p, double y) {
			  return x + y+p;
			}

		public static void main(String[] args) {
		  int myNum1 = plusMethod(8, 5);
		  double myNum2 = plusMethod(4.3, 6.26);
		  System.out.println("int: " + myNum1);
		  System.out.println("double: " + myNum2);
		  
		  System.out.println(plusMethod(3.5, 20, 4.5));
		}
}
