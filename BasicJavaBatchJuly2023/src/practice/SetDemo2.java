package practice;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer>  rollNumber = new HashSet<>();
		
		rollNumber.add(101);
		rollNumber.add(102);
		rollNumber.add(103);
		
		System.out.println(rollNumber);
		
		rollNumber.add(104);
		rollNumber.add(105);
		rollNumber.add(106);
		System.out.println(rollNumber);
		
		
	}

}
