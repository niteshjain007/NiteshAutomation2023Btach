package practice;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		
		
		System.out.println("======================");

		List<String> shoppingList = new ArrayList<String>();
		
		shoppingList.add("fruit");
		shoppingList.add("watch");
		
		System.out.println(shoppingList);
		shoppingList.add("tea");
		shoppingList.add("salt");
		shoppingList.add("toy");
		shoppingList.add("chocolate");
		shoppingList.add("mug");
		
		System.out.println(shoppingList);
		
		int q = shoppingList.size();
		System.out.println(q);
		
		for(int p=0; p<q ; p++)
		{
			System.out.println(shoppingList.get(p));
		}
		System.out.println("======================");
		
		for(String temp : shoppingList)
		{
			System.out.println(temp);
		}
	
		/////////////////////////////
		
		shoppingList.add(4, "bag");
		
		System.out.println(shoppingList);
		
		System.out.println(shoppingList.contains("egg"));
		
		shoppingList.add("toy");
		System.out.println(shoppingList);
		System.out.println(shoppingList.lastIndexOf("toy"));
		
		shoppingList.remove(1);
		System.out.println(shoppingList);
		
		shoppingList.remove("mug");
		System.out.println(shoppingList);
		
		shoppingList.set(0, "banana");
		System.out.println(shoppingList);
		
		System.out.println(shoppingList.isEmpty());
		shoppingList.clear();
		System.out.println(shoppingList.isEmpty());
		System.out.println(shoppingList);
		
		q = shoppingList.size();
		System.out.println(q);
		
		shoppingList.add("fruit");
		System.out.println(shoppingList);
		
		
		
		
		
		
		
	}

}
