package practice;

public class DatatypeDemo {

	public static void main(String[] args) {
		
		
		boolean q = false;
		q= true;
		System.out.println(q);
		
		int num1=10,num2=12;
		
		q = (num1 > num2);   // q= false
		boolean w = (num2 > num1);  // w = true
		if(q)
		{
			System.out.println("num1 is greater");
		}
		if(w)
		{
			System.out.println("num2 is greater");
		}
		
		System.out.println("hi..");
		
		char section = 'B';
		System.out.println("my secition is: " + section);
		
		section = '$';
		System.out.println("my secition is: " + section);
		
		byte e = 34;
		System.out.println(e);
		
	    float t = 45.2002f;
	    System.out.println(t);
	    t = t + 2;
	    System.out.println(t);
		
		
	    double percentage = 55.67;
	    System.out.println("percentage ="+ percentage);
	    percentage = (360.00/400.00)*100;
	    System.out.println("percentage ="+ percentage);
		
		String y = "my name is qatestology";
		System.out.println(y);
		
		y = y + "..and i train ppl";
		System.out.println(y);
		
		
		
	}

}
