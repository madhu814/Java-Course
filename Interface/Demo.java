// An interface is a collection of abstract methods. It is used to achieve abstraction and multiple inheritance in Java. An interface is a blueprint of a class. It has static constants and abstract methods.
// Property of interface is that we cannot create an object of interface. We can implement an interface using the implements keyword. An interface can extend another interface using the extends keyword.

interface A
{
    int num = 6;
    void show();
}

public class Demo {
    public static void main(String[] args)
    {
        System.out.println(A.num);   //can access the variable num because it is public, static and final by default in an interface

    }
}