package Errors;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {
        int result = 7 / 0; // This will cause an ArithmeticException (unchecked exception)
        System.out.println("Result: " + result);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine(); // This will cause an IOException (checked exception)
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
}
