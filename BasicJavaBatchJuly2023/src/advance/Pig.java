package advance;

public class Pig extends Animal{

	public static void main(String[] args) 
	{
		 Pig myPig = new Pig(); // Create a Pig object
		 myPig.animalSound();
		 myPig.sleep();
		
	}
	
	public void animalSound()
	{
		 System.out.println("The pig says: wee wee");
	}

}
