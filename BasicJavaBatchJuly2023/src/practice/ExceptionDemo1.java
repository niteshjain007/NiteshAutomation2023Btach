package practice;

import java.io.FileInputStream;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		num1 = 20;
		num2 = 0;
		
		try {
				num3 = num1/num2;
				System.out.println("num3="+num3);
		}catch(ArithmeticException ex)
		{
			System.out.println("some problem while num1/num2::"+ex);
		}
		
		
		int num4 = num2*10;
		System.out.println("num4="+num4);
		
		
		 //FileInputStream fe = new FileInputStream("/Desktop/Java/new.txt");
	}

}
