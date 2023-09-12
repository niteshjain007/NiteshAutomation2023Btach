package practice;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {
		
		double maths,english,science,history;
		double total ,percentage;
		
		maths = 17; english = 42; science= 28; history = 92;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter maths marks");
		
		maths = sc.nextDouble();
		
		System.out.println("enter english marks");
		
		english = sc.nextDouble();
		
		
		System.out.println("enter sceince marks");
		
		science = sc.nextDouble();
		
		System.out.println("enter history marks");
		
		history = sc.nextDouble();
		
		total = maths + english + history + science;
		percentage = ( total / 400 ) * 100 ;
		
		System.out.println(percentage);
		
		if(percentage >=80)
		{
			System.out.println("Grade A");
		}
		
		else if(percentage >=60 && percentage <80)
		{
			System.out.println("Grade B");
		}
		else if(percentage >=40 && percentage <60)
		{
			System.out.println("Grade C");
		}
		else if(percentage< 40)
		{
			System.out.println("Grade F");
		}
		System.out.println("end of program");
	}

}
