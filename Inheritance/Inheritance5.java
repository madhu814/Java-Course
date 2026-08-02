package Inheritance;

class Parent1
{
    int age=18;
}

class Parent2
{
    int age=19;
}

class Child extends Parent1, Parent2 //This will give error, because multiple inheritance is not supported in java.
{
    void disp()
    {
        System.out.println("The age is : "+age);
    }
}

//Multiple inheritance is not supported in java, but we can achieve multiple inheritance using interfaces. 
public class Inheritance5 {
    public static void main(String[] args) {

}
