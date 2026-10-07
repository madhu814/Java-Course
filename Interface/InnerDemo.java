//inner -- member, static, local, anonymous
class Address
{
    String city;
    String state;
    int pincode;
}

class Person
{
    int age;
    String name;
    Address add;

    public  void show()
    {
       System.out.println("in show");
    }
}
class A
{
    public void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        public void display()
        {
            System.out.println("Display method");
        }
    }
}
public class InnerDemo {
    public static void main(String[] args)
    {
        A obj = new A();  //creating an object of the outer class
        A.B obj1 = new A.B();  //creating an object of the inner class
        obj.show();  //calling the method of the outer class
        obj1.display();  //calling the method of the inner class
    }
}
