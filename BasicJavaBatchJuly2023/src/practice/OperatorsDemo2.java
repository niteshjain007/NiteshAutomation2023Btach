package practice;

public class OperatorsDemo2 {

	public static void main(String[] args) {
		// logical operator 
		int x = 6;
		boolean check = (x < 5) &&  (x < 10) ; // F&&T
		System.out.println(check);
		
		boolean check2 = (x < 5) ||  (x < 10) ; // F || T
		System.out.println(check2);
		
		// age >=18 , nationality = "indian" , you can vote
		//boolean canVote = (age>=18) && (nationality == "indian");
		// engineering exam ==== 12 or diploma
		// boolean allowExam = (passed== 12) || (degree== "diploma")
		
		// boolean loginCHeck = (userid == valid) && (password==valid) 
		boolean isRaining = true;
		System.out.println("isRaining::" + isRaining);
		System.out.println("isRaining::" + !isRaining);
		System.out.println("isRaining::" + !(45 > 67));
		
		
		boolean w = true;
	}

}
