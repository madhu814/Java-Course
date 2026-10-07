package Trial;

class Demo
{
       public void disp()
       {
           System.out.println("Single");
       }
   }

public class Launch2 {
    public static void main(String[] args) 
    {
        Demo demo = new Demo();
        // named object -> demo.disp();
        demo.disp();
        // unnamed object -> new Demo().disp();  // we can create an unnamed object of a class and call the method of that class using that object.And while doing this memory is allocated to that object and after the method is executed, that object is destroyed and memory is deallocated.
    }
}
