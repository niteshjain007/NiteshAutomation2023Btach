package practice;

public class MethodDemo1 {

	static void myMethod() {
		System.out.println("I just got executed!");
	}

	public static void main(String[] args) {
		myMethod();
		System.out.println("end of profram..");
		myMethod();
		myMethod();
		
	}
}
