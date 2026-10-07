package Errors;

import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int number = scanner.nextInt(); // This will throw InputMismatchException
            System.out.println("Parsed number: " + number);
            //  adding this in finally block
        } 
        catch (NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            scanner.close();   //this will close the scanner object and free up the resources used by it. It is a good practice to close the scanner object after use to avoid memory leaks.
        }

        // try with resources -> try-with-resources is a feature introduced in Java 7 that allows you to declare one or more resources in the try statement. A resource is an object that must be closed after the program is finished with it. The try-with-resources statement ensures that each resource is closed at the end of the statement. Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, can be used as a resource.
        //try(Scanner scanner1 = new Scanner(System.in)) {
        //    num = sc.nextInt(); // This will throw InputMismatchException
        //}
    }
}
