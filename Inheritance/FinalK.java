package Inheritance;

class Animal1
{
    final int age=19;   //now the value of age cannot be changed in the child class. It is a constant now.   
    final void sleep()
    {
        // age=20; // This would cause a compile-time error because 'age' is final
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1
{
    // This will cause a compile-time error because the sleep() method is final in the parent class
    // void sleep()
    // {
    //     System.out.println("Tiger is sleeping");
    // }
}

public class FinalK {
    
    public static void main(String[] args)
    {
        Tiger1 a = new Tiger1(); // Reference of type Animal1
        a.sleep(); // Calls the overridden sleep() method of Tiger1
    }
}
