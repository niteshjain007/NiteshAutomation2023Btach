package advance;

public class TestThrowAndThrows {

	 // defining a user-defined method  
    // which throws ArithmeticException  
    static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("throwing a new ArithmeticException");  
       
    }  
    //main method  
    public static void main(String args[])  
    {  
        try  
        {  
            method();  
        }  
        catch(Exception e)  
        {  
            System.out.println(e.getMessage());  
        }  
        
        System.out.println("rest of the code..");
    }  
}
