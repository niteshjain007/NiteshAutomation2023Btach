package practice;

public class StringDemo1 {

	public static void main(String[] args) {
		String place = "uniTED KINGDOm";
		
		char check = place.charAt(5);
		System.out.println(check);
		
		String place2 = "UniTED KINGDOm!";
		
		System.out.println(place.compareToIgnoreCase(place2));
		
		System.out.println(place.compareTo(place2));
		
		String tt= place.concat("..hi..");
		System.out.println(tt);
		System.out.println(place);
		
		System.out.println(place.contains("TED"));
		
		
		String place3 = "uniTED KINGDOm";
		
		System.out.println(place.equals(place3));
		
		int f = place.indexOf('m');
		
		System.out.println(f);
		
		System.out.println(place.length());
		
		
		for(int x=0; x<place.length() ; x++)
		{
			System.out.println(place.charAt(x));
		}	
		
		
	}

}
