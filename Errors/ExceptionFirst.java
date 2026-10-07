package Errors;

public class ExceptionFirst {
    public static void main(String[] args) {
      // Syntax Error -> system.out.println("Result: " + c); 
      
      // Logical Error -> int c= num1 - num2;  to reduce this type of error testing is done to check the output of the program.
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int values[] = {1, 2, 3, 4};
        String name = null;

        try
        {
         result = num1 / name.length(); // This will cause a NullPointerException because name is null

         System.out.println("In try block: Result = " + result);
         System.out.println("Accessing array element: " + values[5]); // This will cause an ArrayIndexOutOfBoundsException
        }
       
        //Exception Handling -> try-catch block is used to handle the exception that occurs in the try block. The catch block is used to handle the exception that occurs in the try block. The catch block is executed only if an exception occurs in the try block. If no exception occurs, the catch block is skipped.
        // catch(Exception e)   //e is just a reference variable of the Exception class. It can be any name. It is used to catch the exception that occurs in the try block.U can write anything. It can handle all types of exceptions because Exception is the parent class of all exceptions. But it is not a good practice to use Exception class to catch the exception because it can catch all types of exceptions and we may not know which exception occurred. So it is better to use specific exception classes to catch the exception.
        catch(ArithmeticException e)   //e is just a reference variable of the Exception class. It can be any name. It is used to catch the exception that occurs in the try block.U can write anything.
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        catch(ArrayIndexOutOfBoundsException e)   //e is just a reference variable of the Exception class. It can be any name. It is used to catch the exception that occurs in the try block.U can write anything.
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        catch(Exception e)   //e is just a reference variable of the Exception class. It can be any name. It is used to catch the exception that occurs in the try block.U can write anything.
        {
            System.out.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Result: " + result);
        System.out.println("Program continues after the try-catch block.");

        // Runtime Error -> int c= num1 / num2;  // this will cause a runtime error because we cannot divide a number by zero.
    }
}
