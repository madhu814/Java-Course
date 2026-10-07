package Trial;

interface Calc
{
     void disp();
}

public class Launch1 {
    public static void main(String[] args) 
    {
        //we need to shorten the code, so we can use anonymous class to implement the interface and create an object of the interface at the same time.
        Calc obj = new Calc() {
            @Override
            public void disp() {
                System.out.println("Anonymous class");
            }
        };
        obj.disp();

        //Lambda expression is a short form of anonymous class, so we can use lambda expression to implement the interface and create an object of the interface at the same time.
        Calc obj1 = () -> System.out.println("Lambda expression");
        obj1.disp();


        //Lambda expression can be used only with functional interface, so we can use lambda expression to implement the interface and create an object of the interface at the same time. 
    }
}
