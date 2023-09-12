package practice;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 20;
		int d = 23;
		int e = 40;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		int w[] = {10,15,20,23,40};   // size/length == 5  , index : 0 to 4
		
		System.out.println(w[0]);
		System.out.println(w[1]);
		
		//System.out.println(w[7]); // exception about array index boundry
		
		int rollNumber[] = new int[10];
		
		System.out.println(rollNumber[3]);
		System.out.println(rollNumber[7]);
		
		rollNumber[0] = 6;
		rollNumber[7] = 99;
		
		System.out.println(rollNumber[3]);
		System.out.println(rollNumber[7]);

		rollNumber[3] = (int)76.98;  // typecast
		
		System.out.println(rollNumber[3]);
	}

}



