package practice;

public class StringBufferDemo {

	public static void main(String[] args) {
		String place = "uniTED KINGDOm";
		
		String splited[] =place.split(" ");
		
		System.out.println(splited[1]);
		
		String check = place.toLowerCase();
		
		System.out.println(place);
		System.out.println(check);
		
		
		StringBuffer city = new StringBuffer("new deLHI");
		System.out.println(city);
		city.append("..wow..");
		System.out.println(city);
		
		city.insert(7, "007");
		System.out.println(city);
		
	}

}
