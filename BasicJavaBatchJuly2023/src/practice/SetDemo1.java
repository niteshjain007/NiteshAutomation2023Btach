package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> shoppingItems = new HashSet<>();
		
		shoppingItems.add("fruit");
		shoppingItems.add("watch");
		
		System.out.println(shoppingItems);
		
		shoppingItems.add("tea");
		shoppingItems.add("salt");
		shoppingItems.add("toy");
		shoppingItems.add("chocolate");
		shoppingItems.add("mug");
		
		System.out.println(shoppingItems);
		
		shoppingItems.add("fruit");
		System.out.println(shoppingItems);
		
		for(String temp : shoppingItems)
		{
			System.out.println(temp);
		}
		System.out.println("===================================");
	
		Iterator<String> items = shoppingItems.iterator();
		while(items.hasNext())
		{
			System.out.println(items.next());
		}
		
		System.out.println(shoppingItems.size());
		
		shoppingItems.add(null);
		System.out.println(shoppingItems);
		
		System.out.println(shoppingItems.contains("jeans"));
		
		shoppingItems.remove("mug");
		shoppingItems.remove("tea");
		System.out.println(shoppingItems);
		
		
		
		
	}

}
