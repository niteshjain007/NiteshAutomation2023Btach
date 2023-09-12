package practice;

public class OverloadingDemo {

	public static void main(String[] args) {
		OverloadingDemo od= new OverloadingDemo();
		od.area(4, 9);
		od.area(5);
		od.area(10,17.25);
	}
	
	
	private void area(int l , int w)
	{
		int resultArea= l*w;
		System.out.println(resultArea);
	}
	
	
	public void area(int r)
	{
		double resultArea= (22/7)* r * r;
		System.out.println(resultArea);
	}
	
	public void area(int l , double w)
	{
		double resultArea= l*w;
		System.out.println(resultArea);
	}

	
	public void area(double l , int w)
	{
		double resultArea= l*w;
		System.out.println(resultArea);
	}
	
	
}
