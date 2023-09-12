package practice;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		funA();
		funB();
	}

	
	
	public static void funA()
	{
		System.out.println("i am under funA");
		
		int d[] = new int[4]; d[0]=12; d[1]=34; d[2]=44; d[3]=9;
		try {
		for(int f =0 ; f<6 ; f++)
		{
			System.out.println(d[f]);
		}
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("some issue with index");
		}
		
	}
	
	public static void funB() throws ArrayIndexOutOfBoundsException
	{
		System.out.println("i am under funA");
		
		int d[] = new int[4]; d[0]=12; d[1]=34; d[2]=44; d[3]=9;
		
		for(int f =0 ; f<6 ; f++)
		{
			System.out.println(d[f]);
		}
		
		
	}

}
