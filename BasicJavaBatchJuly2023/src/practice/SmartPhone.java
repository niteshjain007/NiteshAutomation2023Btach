package practice;

public class SmartPhone extends Phone{

	public static void main(String[] args) {
		SmartPhone s1 = new SmartPhone();
		s1.sound();
		s1.networkConnectivity();
		
		s1.callDisconnect(9988);
	}
	
	public void sound()
	{
		System.out.println("smart phone new age tune");
	}
	
	public int callDisconnect(int x)
	{
		System.out.println("disconnect..."+x);
		System.out.println("new lights..");
		return 0;
	}

}
