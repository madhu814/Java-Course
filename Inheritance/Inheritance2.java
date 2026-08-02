package Inheritance;

class Human1 
{
    private String name;
    int age;

    Human1()
    { 
        System.out.println("Human class constructor");
    }

    void sleep()    
    {
        age=18;
        System.out.println("Human is sleeping");
        System.out.println("Age is: "+age);
    }
}

class Student1 extends Human1
{
    //  even if you don't write constructor in child class, compiler will create default constructor for you and it will call parent class constructor first and then child class constructor.
    //public Student1()
    //{ 
    //  super(); // compiler will add this line automatically if you don't write it. It will call parent class constructor first and then child class constructor.
    //}
    void disp()
    {
        System.out.println("The age is : "+age);
       // System.out.println("The name is : "+name); // name is private in parent class, so it can't be accessed in child class.
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.sleep();
        s1.disp();
    }
}
