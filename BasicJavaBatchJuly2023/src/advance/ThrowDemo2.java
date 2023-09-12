package advance;

public class ThrowDemo2 {

	public int div(int number1, int number2) {
		try {
			return number1 / number2;
		} catch (ArithmeticException e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		ThrowDemo2 th = new ThrowDemo2();
		try {
			System.out.println(th.div(40, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("some more stmt");
	}

}
