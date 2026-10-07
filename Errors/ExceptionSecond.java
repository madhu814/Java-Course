package Errors;

// Handling and ducking of exception using throws keyword.
class Demo
{
    public void a() throws Exception
    {
        b();  // calling method b() which throws an exception. Since method a() does not handle the exception, it must declare that it throws the exception using the throws keyword.
        // try
        // {
        //     b();
        // }
        // catch(Exception e)
        // {
        //     System.out.println("An error occurred in method a: " + e.getMessage());
        // }
    }

    public void b() throws Exception
    {   // this function throws an exception. Since method b() does not handle the exception, it must declare that it throws the exception using the throws keyword.
        //This is done to optimize the code and to avoid writing try-catch block in every method. Instead, we can declare that the method throws an exception and handle it in the calling method.
      int num1 = 8;
      int num2 = 0;
    
            int result = num1 / num2; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
            System.out.println("An error occurred: " + e.getMessage());
    
    }
}
public class ExceptionSecond {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try
        {
            obj.a();  // calling method a() which throws an exception. Since method main() does not handle the exception, it must declare that it throws the exception using the throws keyword.
        }
        catch(Exception e)
        {
            System.out.println("An error occurred in main: " + e.getMessage());
        }
    }   
}
