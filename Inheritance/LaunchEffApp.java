package Inheritance;
import java.util.*;

abstract class Shape    //abstarct method means the class which has unimplemented methods. Abstract class cannot be instantiated directly. It can have abstract methods and concrete methods.
{
    float area;

    abstract public void input(); // Abstract method, must be implemented by subclasses
    abstract public void compute(); // Abstract method, must be implemented by subclasses
    public void disp() // Concrete method, can be used by subclasses
    {
        System.out.println("Area is: " + area);
    }
}

class Rectangle1 extends Shape
{
    float length;
    float breadth;

    public void input()
    {
        System.out.println("Calculation of Rectangle app: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter length: ");
        length = scan.nextFloat();
        System.out.print("Please enter breadth: ");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }
}
