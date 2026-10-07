package Inheritance;

class Demo1
{
    int a,b;

    public Demo1()
    {
       System.out.println("Parent class constructor");   
    }

    public Demo1(int x, int y)
    {
        System.out.println("Parent class parameterized constructor");
        a=x;
        b=y;
    }
}

class Demo2 extends Demo1
{
    int m,n;

    public Demo2()
    {
        this(10,20); // calling child class parameterized constructor
       // super(); //duty of super method is to call parent class constructor.
        System.out.println("Child class constructor");
    }

    public Demo2(int x, int y)
    {
        super(x,y); // calling parent class parameterized constructor
        System.out.println("Child class parameterized constructor");
        m=x;
        n=y;
    }
}

public class ConstructorExp {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2(10,20);
    }

}
