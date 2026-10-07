interface A
{
    void show();

    //non static method in interface is by default public and abstract. We cannot use private, protected, final, static, synchronized, native, strictfp and transient keywords with non-static methods in interface.
    default void config()   //adding a new method to the interface, then we have to implement this method in the classes that implement this interface, till Java 8, we cannot add a new method to an interface without breaking the existing implementation classes. But from Java 8, we can add a new method to an interface using default and static methods.
    {
        System.out.println("Configuring");
    }
static void abc()
    {
        System.out.println("Static method");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("Show method");
    }
}

public class Java8Fe {
    public static void main(String[] args)
    {
        A.abc();  //calling static method of interface
      //not possible to call non static method,  A.config(); //calling default method of interface
       //to call non static method, we have to create an object of the class that implements the interface and then call the method using that object.
        A obj = new B();  //creating an object of the class that implements the interface
        obj.config();  //calling default method of interface
          obj.show();  //calling non static method of interface
        }
}
