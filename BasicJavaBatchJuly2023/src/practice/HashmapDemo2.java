package practice;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo2 {

	public static void main(String[] args) {
		HashMap <Integer,String> students = new HashMap <Integer,String> ();
		
		students.put(101, "john");
		students.put(102, "anita");
		students.put(103, "nitesh");
		
	    for(Map.Entry m : students.entrySet())
	    {    
	        System.out.println(m.getKey()+" "+m.getValue());    
	    }  	
	
	    for ( int key : students.keySet() )
	    {
	        System.out.print( key );
	        System.out.print( " "+students.get(key) );
	        System.out.println();
	    }
	    
	    for ( String v : students.values() )
	    {
	        System.out.println( v );
	       
	    }
	    
	    System.out.println(students.size());
	    students.put(112, "tina");
	    System.out.println(students.size());
	}

}
