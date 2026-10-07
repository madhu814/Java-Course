package Trial;

public class Car {
    class Engine 
    {
       void disp()
       {
           System.out.println("Engine is running");
       }
    }
    public static void main(String[] args)
    {
       System.out.println("Main method outer class");

       Car car = new Car();
       Car.Engine e = car.new Engine();
       e.disp();

       new Car().new Engine().disp();  // we can create an unnamed object of a class and call the method of that class using that object.And while doing this memory is allocated to that object and after the method is executed, that object is destroyed and memory is deallocated.
       
    }
}
