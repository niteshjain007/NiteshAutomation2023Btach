package advance;

public class Mammal implements AnyAnimal{

	public static void main(String[] args) {
		AnyAnimal am1 =  new Mammal();
		am1.eat();	
		
		Mammal mm1 = new Mammal();
		
		System.out.println(mm1.distanceTravelledDaily());
		mm1.travel();
	}

	@Override
	public void eat() {
		System.out.println("mammal eat");
		
	}

	@Override
	public void travel() {
		System.out.println("mammal travel");
		
	}
	
	public int distanceTravelledDaily()
	{
		return 12;
	}

}
