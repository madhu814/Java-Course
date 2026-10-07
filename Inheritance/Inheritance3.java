package Inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void age(int x)
    {
        System.out.println("Animal age is ");
    }
}

class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger is eating");
    }

    public void age(int x)
    {
        System.out.println("Tiger age is 5");
    }
}     //until here it is called single inheritance, because one class is inheriting from one class.

class Monkey extends Animal 
{
     
}

class Dear extends Animal 
{

}
//heirical inheritance, because multiple classes are inheriting from one class.
public class Inheritance3 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep(); // Inherited from Animal
        t.eat();   // Defined in Tiger
        t.age(5);  // Defined in Tiger
    } 
}
