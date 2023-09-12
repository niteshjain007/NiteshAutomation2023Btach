package practice;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		char vowel = ' ';
		String temp= null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		temp = sc.next();
		
		vowel = temp.charAt(0);
		
		switch (vowel) {
		case 'a':
			System.out.println("I am vowel");
			//
			break;
		case 'e':
			System.out.println("I am vowel");
			break;
		case 'i':
			System.out.println("I am vowel");
			break;
		case 'o':
			System.out.println("I am vowel");
			break;
		case 'u':
			System.out.println("I am vowel"); 
			break;
		default:
			System.out.println("I am not a vowel");
		}
	}
}
