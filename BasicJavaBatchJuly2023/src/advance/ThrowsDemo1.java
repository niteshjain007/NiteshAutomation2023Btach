package advance;

public class ThrowsDemo1 {

    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException{  
       int c = 34-7;
       System.out.println(c);
       
    	int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
    	ThrowsDemo1 obj = new ThrowsDemo1();  
        try {
        System.out.println(obj.divideNum(45, 0));  
        }catch(Exception ex)
        {
        	System.out.println("\nNumber cannot be divided by 0");
        }
        System.out.println("Rest of the code..");  
    }  
}
