package Inheritance;

class Animal
{
    void sleep()
    {
        System.out.println("Animal is sleeping");
    }
}

class Tiger extends Animal
{
    void eat()
    {
        System.out.println("Tiger is eating");
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
    } 
}
