package Inheritance;


//Using Polymorphism, we can call the same method on different objects and each object will respond in its own way. This is achieved by method overriding, where a subclass provides a specific implementation of a method that is already defined in its superclass.
//Use of Ploymorphism is to allow a single method to be used with different types of objects, making the code more flexible and easier to maintain. It allows us to write code that can work with objects of different classes in a uniform way, without needing to know the specific class of each object at compile time.
//Use of Polymorphism is to achieve loose coupling. Loose coupling means that the classes are independent of each other and can be modified without affecting each other. Tight coupling means that the classes are dependent on each other and any change in one class will affect the other class. Polymorphism allows us to achieve loose coupling by allowing us to write code that can work with objects of different classes in a uniform way, without needing to know the specific class of each object at compile time.
//In loose coupling the child is called from parent and tight coupling vice versa happens. Loose coupling is achieved by using polymorphism, where a parent class reference variable can point to a child class object. Tight coupling is achieved by using inheritance, where a child class inherits from a parent class and can access its methods and variables directly.
class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway to take off");
    }

    public void fly()
    {
        System.out.println("CargoPlane is flying at lower height");
    }
}

class PassengerPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium runway to take off");
    }

    public void fly()
    {
        System.out.println("PassengerPlane is flying at medium height");
    }
}

class FighterPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("FighterPlane requires small runway to take off");
    }

    public void fly()
    {
        System.out.println("FighterPlane is flying at high height");
    }
}

class Airport
{
    public void poly(Aeroplane1 a) // This method can take any object of Aeroplane1 or its subclasses as argument
    {
        a.takeOff();  // This will call the overridden takeOff() method of the actual object passed (CargoPlane1, PassengerPlane1, or FighterPlane1)
        a.fly();     // This will call the overridden fly() method of the actual object passed (CargoPlane1, PassengerPlane1, or FighterPlane1)

        System.out.println("-------------------------------------------------");
    }
}


public class LaunchPoly {
    public static void main(String[] args) {
       CargoPlane1 cp= new CargoPlane1();
       //Areoplane1 a= new CargoPlane1();  --- THIS IS ALSO POLYMORPHISM, BECAUSE PARENT CLASS REFERENCE VARIABLE IS POINTING TO CHILD CLASS OBJECT. AND IT IS VALID.
       PassengerPlane1 pp= new PassengerPlane1();
       FighterPlane1 fp= new FighterPlane1();

       //If we had not used polymorphism, we would have to call the methods of each class separately like this:
      // cp.takeOff();    
     //  cp.fly();

       // pp.takeOff();
       //  pp.fly();

         // fp.takeOff();
         //   fp.fly();

       Airport a= new Airport();
       a.poly(cp);
       a.poly(pp);
       a.poly(fp);

    }
}
