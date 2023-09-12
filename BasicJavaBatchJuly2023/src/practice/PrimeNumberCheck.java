package practice;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int vowelCount  = 0;
		String stmt = "i love india";
		
		for(int i=0; i< stmt.length() ; i++)
		{
			if(stmt.charAt(i)=='a' ||
					stmt.charAt(i)=='e' ||
					stmt.charAt(i)=='i' ||
					stmt.charAt(i)=='o' || 
					stmt.charAt(i)=='u' )
			{
				vowelCount++;
			}
		}
		
		System.out.println(vowelCount);
	}

}
