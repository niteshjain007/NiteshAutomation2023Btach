package practice;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap <Integer,String> students = new HashMap <Integer,String> ();
		
		students.put(101, "john");
		students.put(102, "anita");
		students.put(103, "nitesh");
		
		System.out.println(students);
		
		students.put(102, "test");
		System.out.println(students);
		
		String check = students.get(103);
		System.out.println(check);
		
		System.out.println(students.containsKey(105));
		System.out.println(students.containsValue("nitesh"));
		
		students.remove(103);
		System.out.println(students);
		
		
		students.replace(101, "john", "newJohn");
		System.out.println(students);
		
		
		HashMap <String ,Double> heightOfPlaces = new HashMap <String ,Double> ();
		heightOfPlaces.put("sol", 450.90);
		heightOfPlaces.put("sou", 550.00);
		System.out.println(heightOfPlaces);
		
		heightOfPlaces.put("home", null);
		System.out.println(heightOfPlaces);
		
		heightOfPlaces.put("home2", null);
		System.out.println(heightOfPlaces);
		
		heightOfPlaces.put(null , 45.90);
		System.out.println(heightOfPlaces);
		
		
		heightOfPlaces.put(null , 100.50);
		System.out.println(heightOfPlaces);
		
		
		
		
		
		
	}

}
