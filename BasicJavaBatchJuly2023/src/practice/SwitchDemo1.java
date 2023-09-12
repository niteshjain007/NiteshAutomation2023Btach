package practice;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		int day=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		day = sc.nextInt();
		
		switch(day)
		{		
		case 1: System.out.println("monday");
				break;
		case 2: System.out.println("tuesday");
				break;
		case 3: System.out.println("wednesday");
				break;
		case 4:	System.out.println("thursday");
				break;
		case 5:	System.out.println("friday");
				break;
		case 6: System.out.println("saturday");
				break;
		case 7:	System.out.println("sunday");
				break;
		default: System.out.println("invliad range, valis is 1 to 7");
		}	
		System.out.println("end of program..");
	}

}
