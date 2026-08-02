package Inheritance;

class Demo1
{
   void disp()
   {
       System.out.println("Disp written in Demo1 class");
   }
}

class Demo2 extends Demo1{
   /*  void disp()
   {
       System.out.println("Demo2 class");
   }  Already this method is inherited  */
}

class Demo3 extends Demo2{
   /*void disp()
   {
       System.out.println("Demo3 class");
   }*/
}

public class Inheritance4 {
   public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.disp(); // This will call the disp() method from Demo1
        // If you uncomment the disp() method in Demo2 or Demo3, it will override the inherited method from Demo1 and will be called instead.
        //This is called multilevel inheritance, where a class inherits from another class, which in turn inherits from another class. In this case, Demo3 inherits from Demo2, which inherits from Demo1.
    } 
}
