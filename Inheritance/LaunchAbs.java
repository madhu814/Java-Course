package Inheritance;

abstract class Aeroplane3  // Abstract class, cannot be instantiated directly
{

    //ABSTRACT  MEANS no body.
    //YOU CAN HAVE ABSTRACT METHODS IN AN ABSTRACT CLASS. ABSTRACT METHODS DO NOT HAVE A BODY AND MUST BE IMPLEMENTED BY SUBCLASSES.
     abstract void takeOff(); // Abstract method, must be implemented by subclasses
     abstract void fly();      // Abstract method, must be implemented by subclasses

     public void landing() // Concrete method, can be used by subclasses
     {
         System.out.println("Aeroplane is landing");
     }
    
}


class CargoPlane extends Aeroplane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway to take off");
    }

    public void fly()
    {
        System.out.println("CargoPlane is flying at lower height");
    }
    public void alert()      //this method is specific to CargoPlane and not present in the Aeroplane3 class
    {                         //Hense, it cannot be called using a reference of type Aeroplane3, but can be called using a reference of type CargoPlane
        System.out.println("CargoPlane is alerting");
    }
}


public class LaunchAbs
{
    public static void main(String[] args)
    {
        Aeroplane3 a = new CargoPlane(); // Reference of type Aeroplane3
        a = new CargoPlane(); // Object of type CargoPlane is assigned to reference of type Aeroplane3

        a.takeOff(); // Calls the overridden takeOff() method of CargoPlane
        a.fly();     // Calls the overridden fly() method of CargoPlane
        a.landing(); // Calls the landing() method of Aeroplane3
        ((CargoPlane) a).alert(); // This line will work because we are casting the reference 'a' to CargoPlane, allowing us to call the alert() method specific to CargoPlane --tHIS IS CALLED DOWNCASTING.
        // a.alert(); // This line would cause a compile-time error because alert() is not defined in Aeroplane3


        Aeroplane3 a3 = new CargoPlane(); // Reference of type Aeroplane3
        a3.takeOff(); // Calls the overridden takeOff() method of CargoPlane
        a3.fly();     // Calls the overridden fly() method of CargoPlane
        a3.landing(); // Calls the landing() method of Aeroplane3

        // a.alert(); // This line would cause a compile-time error because alert() is not defined in Aeroplane3
    }
}