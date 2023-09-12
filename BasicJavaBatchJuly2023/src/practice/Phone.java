package practice;

public class Phone {

	public static void main(String[] args) {

		Phone p1 = new Phone();
		p1.sound();
		
	}
	
	
	public void sound()
	{
		System.out.println(" old type of phone tune");
	}
	
	public void networkConnectivity()
	{
		System.out.println("connect nw");
	}
	
	public int callDisconnect(int phNo)
	{
		System.out.println("disconnect" + phNo);
		return 0;
	}

}
