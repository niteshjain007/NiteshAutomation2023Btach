package practice;

public class IfElseDemo1 {

	public static void main(String[] args) {
		
		boolean isRaining = false;
		
		if(isRaining == true)
			System.out.println("dont go school");
		
		else 
			System.out.println(" go school");
		
		int x = 45; int  y =30;
		
		if(x>y)
		{
			System.out.println("x is greater");
		}
		else
		{
			System.out.println("y is greater");
			y = 90;
			System.out.println(y);
		}
		
		
	}

}
