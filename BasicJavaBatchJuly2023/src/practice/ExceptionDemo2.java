package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		num1 = 20;
		num2 = 0;
		
		try {
				num3 = num1/num2;
				System.out.println("num3="+num3);
				FileInputStream fe = new FileInputStream("/Desktop/Java/new.txt");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("some problem while num1/num2::"+ex);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("file not present..");
		}
		catch (Exception e) {
			System.out.println("exception caught");
		}
		finally {
			System.out.println("i am under finally");
		}
		
		int num4 = num2*10;
		System.out.println("num4="+num4);
		
		
		 //
	}

}
